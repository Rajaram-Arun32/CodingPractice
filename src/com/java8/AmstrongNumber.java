package com.java8;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int a=n,b=0,rem;
		double res=0;
		while(a!=0) {
			a=a/10;
			++b;
		}
		a=n;
		while(a!=0) {
			rem=a%10;
			res=res+Math.pow(rem, b);
			a=a/10;
		}
		if(res==n) {
			System.out.println("Amstrong");
		}else{
			System.out.println("not");
		}
	}

}
