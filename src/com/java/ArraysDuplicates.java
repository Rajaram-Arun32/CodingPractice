package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysDuplicates {
	public static void main(String[] args) {
		int[] a= {1,2,8,4,9,85,9,6,8,9,5,2,6};
		Arrays.sort(a);
		int[]Array = Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(Array));
		Map<Integer, Long> array = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(array);
		 Optional<Integer> any = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).distinct().skip(3).findAny();
		 System.out.println(any);
		 List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());
		 Collections.reverse(collect);
		 System.out.println(collect);
	}
}
