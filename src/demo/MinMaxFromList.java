package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxFromList {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(5,3,9,2,8,6,1);
		l.stream().sorted().limit(3).forEach(System.out::print);
		l.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		Integer integer = l.stream().sorted().skip(2).findAny().get();
		System.out.println(integer);
		
	}

}
