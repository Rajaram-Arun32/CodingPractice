package com.java8;

import java.util.stream.IntStream;

public class PrimeorNot {

	public static void main(String[] args) {
		int n=190;
		boolean noneMatch = IntStream.range(2, n).allMatch(i->n%i!=0);
		if(noneMatch) {
			System.out.println("it is a primenumber");
		}else {
			System.out.println("it is not a prime");
		}

	}

}
