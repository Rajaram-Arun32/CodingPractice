package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesValues {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("vimal", "Venkat", "Sankar", "vimal", "karthi", "Arun", "Thanasi", "Venkat");
		Map<String,Long> g = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		g.entrySet().stream().filter(n -> n.getValue()> 1).forEach(System.out::println);
	}

}
