package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		//String Starts with number
		List<String>l=Arrays.asList("1arun","ashu","jo9e","baddu");
		//string starting with number at 1st position
		l.stream().filter(m->Character.isDigit(m.charAt(0))).forEach(System.out::println);
		//string cotains number at any position.
		l.stream().filter(a->a.chars().anyMatch(Character::isDigit)).forEach(System.out::println);
		int[] a= {1,2,3,6,5};
		//Array sorted in reverse order
		Object[] array = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).toArray();
		System.out.println(Arrays.toString(array));
		//Array in reverse order
				int[] array2 = IntStream.range(0, a.length).map(i-> a[a.length-1-i]).toArray();
				System.out.println(Arrays.toString(array2));
		String s1="Bokala Ramya";
		//String reverse
		Stream.of(s1.split(" ")).map(word->new StringBuffer(word).reverse()).forEach(System.out::print);
		
		
	}

}
