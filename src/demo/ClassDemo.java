package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ClassDemo {

	public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
//         list.add(new Employee("Arun",24));
//         list.add(new Employee("Arun",24));
//         list.add(new Employee("Arvind",25));
//         list.add(new Employee("Anvesh",21));
      // List<Employee>sort=list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
       //sort.forEach(System.out::println);
        List<List<Employee>>l=Arrays.asList(
        		Arrays.asList(new Employee("Abhi",24)),
        		Arrays.asList(new Employee("Arun",20)),
        		Arrays.asList(new Employee("Arjun",22))
        		);
//         List<Employee>sort=l.stream().sorted()
//        		 {
//        	 return (s1 CompareTo(s2))
//        		 }).collect(Collectors.toList());
         //sort.forEach(System.out::println);
//        List<Employee>starts=list.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());
//        starts.forEach(System.out::println);
        
        //l=l.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        List<Employee>al=l.stream().flatMap(emp->emp.stream()).collect(Collectors.toList());
        Map<Object, List<Employee>> ma=al.stream().collect(Collectors.groupingBy(emp->emp.getAge()));
        System.out.println(ma);
        }
	

}
