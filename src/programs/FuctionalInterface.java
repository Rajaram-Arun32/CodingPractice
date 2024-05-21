package programs;

import java.util.function.BinaryOperator;

public class FuctionalInterface {

	public static void main(String[] args) {
		BinaryOperator<Integer> multiplier=(a,b)->a*b;
		int output=multiplier.apply(5, 3);
		System.out.println(output);

	}

}
