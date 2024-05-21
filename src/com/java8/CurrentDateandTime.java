package com.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateandTime {

	public static void main(String[] args) {
		LocalDateTime currentdate=LocalDateTime.now();
		System.out.println(currentdate);
		DateTimeFormatter formatt=DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String formatdate=currentdate.format(formatt);
		System.out.println(formatdate);
	}

}
