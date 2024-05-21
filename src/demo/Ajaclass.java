package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ajaclass {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,22,25,57,19,45,12);
		
		long count = list.stream().filter(a->a%2==0).count();
		System.out.println(count);
		list.stream().filter(s->s%2==0).forEach(System.out::println);
		list.stream().map(s->s+"").filter(s->s.endsWith("5")).forEach(System.out::print);
		//print reverse order
		Integer l1=list.stream().max(Comparator.reverseOrder()).get();
		System.out.println(l1);
		//elements devides with 5
		List i1=list.parallelStream().filter(i->i%5==0).collect(Collectors.toList());
		System.out.println(i1);
		//remove duplicates
		list.stream().distinct().forEach(System.out::println);	
		}

}
