package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("arun","anil","akhil","abhi","anvesh");
		List<String> c= li.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(c);
		String s="ArunRajaram";
		Long collect = Arrays.stream(String.valueOf(s).split("")).collect(Collectors.counting());
		System.out.println(collect);
		Entry<String, Long> entry = Arrays.stream(String.valueOf(s).split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(k->k.getValue()>1).findFirst().get();
		System.out.println(entry.getKey());
				
	}

}
