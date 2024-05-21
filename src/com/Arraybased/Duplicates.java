package com.Arraybased;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		int arr[]= {6,8,3,8,6,0,5,8,2,7};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
//
		List<Integer>duplicates=findduplcates(arr);
		System.out.println(duplicates);
	}
	public static List<Integer> findduplcates(int[]arr){
		Set<Integer>set=new HashSet<>();
		List<Integer>duplicates=new ArrayList<Integer>();
		for(int a:arr) {
			if(!set.add(a)) {
				duplicates.add(a);
			}
		}
		return duplicates;
	}

}
