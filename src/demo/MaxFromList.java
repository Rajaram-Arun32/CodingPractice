package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxFromList {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,5,8,4,7,9,4,8,5,6);
		l.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);
		l.stream().sorted().findFirst().ifPresent(System.out::print);
		//Multiply with 3 to all in list
		List<Integer> collect = l.stream().map(i->i*3).collect(Collectors.toList());
		System.out.println(collect);
		//only print dublicate count
		long count = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(k->k.getValue()>1).count();
		System.out.println(count);
	}

}
