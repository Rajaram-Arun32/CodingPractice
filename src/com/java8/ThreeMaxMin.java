package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxMin {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,9,3,6,7,3,8,2,6,6,4);
		l.stream().sorted().limit(3).forEach(System.out::println);
		l.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
