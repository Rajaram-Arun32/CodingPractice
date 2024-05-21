package programs;

public class Fibonacci {

	public static void main(String[] args) {
		int a=10;
		for(int i=0;i<a;i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
	public static int fibonacci(int a) {
		if(a<=1) {
			return a;
		}
		return fibonacci(a-1)+fibonacci(a-2);
	}
}
