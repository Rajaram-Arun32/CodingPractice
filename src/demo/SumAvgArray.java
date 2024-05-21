package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumAvgArray {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(5,3,8,0,5,4,9,2,7);
	int l=list.stream().mapToInt(Integer::intValue).sum();
	System.out.print(l);
	OptionalDouble l1=list.stream().mapToInt(Integer::intValue).average();
	System.out.println(l1);
	}
	
}
