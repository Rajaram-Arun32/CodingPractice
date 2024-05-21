package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="Arun Rajaram";
		List<String>l=Arrays.asList("Arun","anil","Akhil");
		 List<StringBuffer> list = Arrays.stream(s.split(" ")).map(f->new StringBuffer(f).reverse()).collect(Collectors.toList());
		 Collections.reverse(list);
		 System.out.println(list);
		 //print list of string whose length is greater than 3
		 long count = l.stream().filter(e->e.length()>3).count();
		 System.out.println(count);
		 List<String> collect = l.stream().filter(i->i.length()>3).collect(Collectors.toList());
		 System.out.println(collect.size());
		 System.out.println(collect);
	}

}
