package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 3, 54, 6, 464, 6, 4);
		
		HashSet<Integer> hashSet=new  HashSet<Integer>();
		
		list.stream().filter(i -> hashSet.add(i)).forEach(System.out::println);

	}

}
