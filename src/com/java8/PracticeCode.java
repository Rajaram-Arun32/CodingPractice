package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeCode {

	public static void main(String[] args) {
		List<Employee>list=new ArrayList<>();
		list.add(new Employee(1,"Arun","male", 4000));
		list.add(new Employee(2,"Arjun","male", 5000));
		list.add(new Employee(3,"Archana","female", 4000));
		list.add(new Employee(4,"Anil","male", 5000));
		list.add(new Employee(5,"Akhila","female", 3500));
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(collect);
		List<Employee> collect3 = list.stream().collect(Collectors.groupingBy(Employee::getSalary))
		.values().stream()		
		.filter(e->e.size()>1)
		.flatMap(Collection::stream)
		.collect(Collectors.toList());
		System.out.println(collect3);
		Map<Double, List<Employee>> collect2 = list.stream().filter(e->e.getSalary()==4000).collect(Collectors.groupingBy(Employee::getSalary));
		System.out.println(collect2);
		//Lowest Salary
		 Optional<Employee> collect4 = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		 System.out.println(collect4);
		
	}

}
