package demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		int a=10;
		System.out.println("Fibonacci Series");
		Stream.iterate(new int[]{0, 1},fib->new int[]{fib[1],fib[0]+fib[1]})
		.limit(a)
 	    .mapToInt(fib->fib[0])
		.forEach(System.out::println);
		IntStream.iterate(1, n->n+2).limit(a).forEach(System.out::println);

	}
}
