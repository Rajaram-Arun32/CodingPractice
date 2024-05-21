package com.java8;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumbers {

	public static void main(String[] args) {
		Stream.generate(()->new Random().nextInt()).limit(10).forEach(System.out::println);

	}

}
