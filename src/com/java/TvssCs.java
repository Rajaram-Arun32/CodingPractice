package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvssCs {
	
	public static void main(String[] args) {
		List<String> l = Arrays.asList("vimal", "Venkat", "Sankar", "vimal", "karthi", "Arun", "Thanasi", "Venkat");
		List<String>l1=l.stream().map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		Collections.reverse(l1);
		System.out.print(l1);
	}
}
//	}
//	public static void main(String[] args) {
//		List<String> input = new ArrayList<>();
//		input.add("hello");
//		input.add("world");
//		input.add("java");
//
//		List<String> output = reverseEverything(input);
//
//		System.out.println("Input list: " + input);
//		System.out.println("Reversed list: " + output);
//	}
//
//	public static List<String> reverseEverything(List<String> input) {
//		List<String> output = new ArrayList<>();
//		for (String str : input) {
//			StringBuilder reversed = new StringBuilder(str);
//			reversed.reverse();
//			output.add(reversed.toString());
//		}
//		Collections.reverse(output);
//		return output;
//	}

