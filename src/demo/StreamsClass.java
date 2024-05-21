package demo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsClass {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,4,8,5,1,7);
		int i=12345;
		int j=Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(j);
		//even numbers in a list
		//List l=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		//numbers that adds with 5 in a list
		//List l=list.parallelStream().map(i->i+5).collect(Collectors.toList());
		//Reverse sorted order
		List l=list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		Object[] l1=list.stream().sorted(Collections.reverseOrder()).toArray();
		System.out.println(Arrays.toString(l1));
		System.out.println(l);
	}

}
