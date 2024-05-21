package demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequecyCharcter {

	public static void main(String[] args) {
		String str = "Arun Rajaram";
		String str1 = str.replaceAll("\\s", "");
		Map<String, Long> collect = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

}
