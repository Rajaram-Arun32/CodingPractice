package com.Arraybased;

public class ClosestNumber {

	public static void main(String[] args) {
		int arr[]= {5,3,8,4,9,6,9};
		System.out.println(findclosest(arr,2));
	}
	public static int findclosest(int arr[], int target) {
		int closest=0;
		int mindiff=Math.abs(arr[0]-target);
		if(arr==null||arr.length==0) {
			throw new IllegalArgumentException("Array not be empty");
		}
		for(int i=0;i<arr.length;i++) {
			int diff=Math.abs(target-arr[i]);
			if(mindiff>diff) {
				mindiff=diff;
				closest=arr[i];
			}
		}
	
	return closest;
	}
}
