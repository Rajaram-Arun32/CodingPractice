package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNum {

	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(1,5,8,8,5,9,5,8,9,5);
		Set<Integer>s=new HashSet<Integer>();
		li.stream().filter(e->s.add(e)).forEach(System.out::println);
//		List<Entry<Integer, Long>> list = li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//				.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
//		for (Entry<Integer, Long> entry : list) {
//			System.out.println(entry.getKey());
//			
//		}
//		Integer integer = li.stream().max(Integer::compare).get();
//		System.out.println(integer);
		Integer i = li.stream().skip(2).findFirst().get();
		System.out.println(i);
		li.stream().filter(e->String.valueOf(e).startsWith("8")).forEach(System.out::println);
		li.stream().map(t->Math.pow(t, 2)).filter(s1->s1<50).forEach(System.out::println);
	}

}
