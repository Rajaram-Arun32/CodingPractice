package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListofString {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("arun","anil","akshay","ramya","laxmi");
		l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		String i = l.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(i);
		long count=l.stream().filter(s->s.length()>4).count();
		System.out.println(count);
	
	}
}
