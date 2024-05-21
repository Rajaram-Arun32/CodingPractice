package demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {

	public static void main(String[] args) {
		String s1="lifter";
		String s2="filter";
//		s1=Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
//		s2=Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		s3=Stream.of(s3.split("")).sorted().collect(Collectors.joining());
		s4=Stream.of(s4.split("")).sorted().collect(Collectors.joining());
		if(s3.equals(s4))
		{
			System.out.println("Strings Are equal and anagram");
		}else
			System.out.println("not anagram");

	}

}
