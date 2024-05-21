package programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String str="hello World";
		String collect = Arrays.stream(str.split(" ")).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect);
		Arrays.stream(str.split(" ")).map(e->new StringBuilder(e).reverse()).forEach(System.out::print);
	
	}

}
