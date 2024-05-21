package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDArray {

	public static void main(String[] args) {
		List<Employee>ls=Arrays.asList(
				new Employee(1,"Arun","male",4000.0),
				new Employee(2,"Sachin","male",5000.0),
				new Employee(3,"Hanu","female",9000.0),
				new Employee(4,"romita","female",8000.0));
			List<Employee> collect = ls.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
			System.out.println(collect);
			String[][] employee=new String[collect.size()][4];
			for(int i=0;i<collect.size();i++) {
				Employee emp=collect.get(i);
				employee[i][0]=String.valueOf(emp.getId());
				employee[i][1]=emp.getGender();
				employee[i][2]=emp.getName();
				employee[i][3]=String.valueOf(emp.getSalary());
			}
			for(String[] arr:employee) {
				System.out.println(Arrays.toString(arr));
			}
	}

}
