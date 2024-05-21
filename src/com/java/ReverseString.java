package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
//		String s="abc#k^gkk*s";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char ch=s.charAt(i);
//			if(ch>='a' && ch<='z') {
//				System.out.print(ch);
//				}
//			}
		List<String>l=Arrays.asList("Arun","jyothi","Arun","jyothi","vinay");
		Map<String, Long> collect = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		collect.entrySet().stream().filter(i->i.getValue()>1).forEach(System.out::println);
		}
}
