package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysMerge {

	public static void main(String[] args) {
		int[] a= {1,5,3,8,7};
		int[] b= {4,7,8,3,9};
		int[] i=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(i));
		Set<Integer>lsIntegers=new HashSet<Integer>();
		int[] array = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().filter(e->!lsIntegers.add(e)).toArray();
		//System.out.println(Arrays.toString(array));
		
		//int[] array3 = Arrays.stream(array)..toArray();
		System.out.println(Arrays.toString(array));
		
		Integer[] array1= {1,2,3,4,5};
		Integer[]array2= {3,4,5,6,7};
		//Integer[] b=array1.stream().filter(array2::contains).toArray();
		Set<Integer>set1=Arrays.stream(array1).collect(Collectors.toSet());
		Set<Integer>set2=Arrays.stream(array2).filter(set1::contains).collect(Collectors.toSet());
		System.out.println(set2);
		String s="osmajasmine";
//		String s1=s.toLowerCase();
//		int count = 0;
//		for(int i=0;i<s1.length();i++) {
//			char ch=s1.charAt(i);
//			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
//			//count++;
//			System.out.println(ch+ " index " + i);
//		String s1=s.toLowerCase();
//		s1.chars().filter(ch->"aeiou".indexOf(ch)!=-1).forEach(ch->System.out.println((char) ch));
//			
			}
}
