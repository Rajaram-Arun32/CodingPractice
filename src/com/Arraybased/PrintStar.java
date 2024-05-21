package com.Arraybased;

import java.util.Arrays;

public class PrintStar {

	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		int a[]= {2,3,4,6};	
//		System.out.println(findclosest(a,10));
//	}
//	public static int findclosest(int a[],int target) {
//		int mindiff=Math.abs(a[0]-target);
//		int closest=0;
//		for(int i=0;i<a.length;i++) {
//			int diff=Math.abs(target-a[i]);
//			if(mindiff>diff) {
//				mindiff=diff;
//				closest=a[i];
//			}
//		}
//		return closest;
		Arrays.sort(a);
		System.out.println(a);
		int res=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==res) {
				res++;
			}else {
				System.out.println(res);
			
			}
		}
	}
	}