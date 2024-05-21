package com.java;

public class PrimeProgram {
	public static void main(String[] args) {
//		PrimeProgram p = new PrimeProgram();
//		p.isPrime(29);
//	}	
//	public boolean isPrime(int n) {
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//
//		if (count == 2)
//		{
//			System.out.println("is prime");
//		} else {
//			System.out.println("not a prime");
//		}
//		return true;
//	}
//}
		int strt=2;
		int end=20;
		printprimenumbers(strt,end);
	}
	public static void printprimenumbers(int strt,int end) {
		for(int i=strt;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
			System.out.println();
	}
		public static boolean isPrime(int num) {
			if(num<=1){
			return false;
		}	
	for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
