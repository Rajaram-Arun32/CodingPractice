package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stratswith1 {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(11,43,14,83,19,1442,14);
		List<Integer> c = l.stream().filter(i->String.valueOf(i).startsWith("1")).collect(Collectors.toList());
		System.out.println(c);
		l.stream().map(Object::toString).filter(i->i.startsWith("1")).map(Integer::parseInt).forEach(System.out::println);
		int total=l.size();
		System.out.println(total);
		List<Integer> collect = l.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}

}
