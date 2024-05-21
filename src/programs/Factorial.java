package programs;

public class Factorial {
	
//	public static int fact(int n) {
//		if(n<=1) {
//			return 1;
//		}else {
//			return n*fact(n-1);
//		}
//	}
	public static void main(String[] args) {
//		
//		//Factorial fact=new Factorial();
//		System.out.println(fact(n));
	 int n=5;
	 int fact = 1;
	 for(int i=1;i<=n;i++) {
	 fact=fact*i;
	}
	 System.out.println(fact);
}
}