package com.java8;

import java.util.stream.IntStream;

public class First10Natural {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum=sum+i;	
//		}
//		System.out.println(sum);
	}

}
