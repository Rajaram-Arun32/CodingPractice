package demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharas {

	public static void main(String[] args) {
		String s1="Arun Rajaram";
		Integer []i= {1,2,4,1,5,3,7,8,6,4,7,3,7,8,9,3,7};
		Map<String, Long> s=Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(s);
		Map<Integer,Long>m=Arrays.stream(i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(m);
		}

}
