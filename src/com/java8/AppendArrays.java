package com.java8;

public class AppendArrays {

	public static void main(String[] args) {
		char []a= {'A','B','c'};
		char[]b= {'X','Y','Z'};
		if(a.length!=b.length) {
			System.out.println("Arrays having Different length");
		}
			String[]output=new String[a.length];
			for(int i=0;i<a.length;i++) {
				output[i]=a[i]+"_"+b[i];
			}
			System.out.print("[");
			for(int i=0;i<output.length;i++) {
				System.out.print(output[i]);
				if(i<output.length-1) {
					System.out.print(",");
				}
			}
			System.out.println("]");
		
	}
}
