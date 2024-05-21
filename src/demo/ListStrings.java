package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStrings {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("Arun","Anil","Arif","Akhil","Akshay");
		String collect = l.stream().collect(Collectors.joining(" ", "[", "]"));
		System.out.println(collect);
		
	}

}

