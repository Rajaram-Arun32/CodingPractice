package com.java8;
interface Diary{
	int operate(int a,int b);
}

public class FunctionalInterface  {

	public static void main(String[] args) {
		
		int a1=5;
		int b1=6;
		Diary d=(a,b)->a*b;
		int result=d.operate(a1, b1);
		System.out.println(result);
	}
	

}
