package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringArray {

	public static void main(String[] args) {
	String a[]= {"arun","shyam","vinay","laxmi","anil"};
	
	List<StringBuffer> l=Arrays.stream(a).map(i->new StringBuffer(i).reverse()).collect(Collectors.toList());
	//Collections.reverse(l);
	System.out.println(l);
	}

}
