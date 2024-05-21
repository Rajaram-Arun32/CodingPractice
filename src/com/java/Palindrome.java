package com.java;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		String s="Malayalam";
		String s1=s.toLowerCase();
		boolean s2 = IntStream.range(0, s1.length()/2).noneMatch(i->s1.charAt(i)!=s1.charAt(s1.length()-i-1));
		if(s2) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not a palindrom");
		}
	}

}
