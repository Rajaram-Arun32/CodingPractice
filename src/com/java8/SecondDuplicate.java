package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondDuplicate {

	public static void main(String[] args) {
		int i=12345;
		int j=Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
		System.out.println(j);
		List<Integer>l=Arrays.asList(2,6,9,1,7,3,0,8);
		l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		boolean b=l.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).values().stream().anyMatch(n->n>1);
		System.out.println(b);
		Integer num = l.stream().filter(s->s%2!=0).reduce((a,c)->(a+c)).get();
		System.out.println(num);
	}

}
