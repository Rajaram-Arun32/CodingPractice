package com.java;

import java.io.FileNotFoundException;

class Abc{
	public void m1()throws Exception {
		System.out.println("hello");
	}
}
class Cde extends Abc{
	public void m1() throws FileNotFoundException {
		System.out.println("hi");
	}
}

public class Polymorphism {

	public static void main(String[] args) throws Exception {
		Abc e=new Cde();
		e.m1();

	}

}
