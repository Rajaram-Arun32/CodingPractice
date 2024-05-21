package com.java8;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		String st="Malayalam";
		String str=st.toLowerCase();
		int i=12321;
		String s1=String.valueOf(i);
		String[] s=s1.split("");
		boolean noneMatch = IntStream.range(0, s.length/2).allMatch(e->s1.charAt(e)==s1.charAt(s1.length()-e-1));
		if(noneMatch) {
			System.out.println("is a palindrom");
		}else {
			System.out.println("not a palindrome");
		}
		boolean allMatch = IntStream.range(0, str.length()/2).allMatch(s2->str.charAt(s2)==str.charAt(str.length()-s2-1));
		if (allMatch) {
			System.out.println("is palindrom");
		}else {
			System.out.println("is not paliondrom");
		}
	}

}
