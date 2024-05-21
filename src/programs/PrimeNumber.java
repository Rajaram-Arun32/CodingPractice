package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=19;
		if(isPrime(a)) {
			System.out.println("is prime");
		}else {
			System.out.println("not a prime");
		}
	}
	public static boolean isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}	
}
