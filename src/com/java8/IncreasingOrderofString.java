package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IncreasingOrderofString {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("arun","akhil","anvesh","anil","akshay");
		l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		String string = l.stream().sorted().max(Comparator.comparing(String::length)).get();
		System.out.println(string);
	}
}
