package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparingAge {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
                new Employee(3,"Bob","female",4500),
                new Employee(2,"co00","male",3500),
                new Employee(1,"Adhmk","female",5500),
                new Employee(5,"frkob","male",4000),
                new Employee(4,"eob","female",3000)
        );
		employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).forEach(System.out::print);

	}

}
