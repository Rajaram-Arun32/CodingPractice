package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeCode2 {
	
	public static void main(String[] args) {
		List<Employee>list=new ArrayList<>();
		list.add(new Employee(1,"Arun","male", 4000));
		list.add(new Employee(2,"Arjun","male", 5000));
		list.add(new Employee(3,"Archana","female", 4000));
		list.add(new Employee(4,"Anil","male", 5000));
		list.add(new Employee(5,"Akhila","female", 3500));
		//increasing salary with 10%
		//List<Employee> peek = list.stream().peek(emp->emp.setSalary(emp.getSalary()*1.10)).collect(Collectors.toList());
		//System.out.println(peek);
		list.stream().filter(s->s.getSalary()<=4000).forEach(System.out::println);
		//sorting the employees based on the name
		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
