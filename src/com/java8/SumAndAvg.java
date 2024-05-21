package com.java8;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumAndAvg {

	public static void main(String[] args) {
		int n[]= {1,4,9,3,9,5,8,2};
		int sum = Arrays.stream(n).boxed().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		OptionalDouble average = Arrays.stream(n).boxed().mapToInt(Integer::intValue).average();
		System.out.println(average);

	}

}
