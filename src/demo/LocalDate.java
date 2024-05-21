package demo;

import java.time.temporal.ChronoUnit;

public class LocalDate {

	public static void main(String[] args) {
		java.time.LocalDate d=java.time.LocalDate.of(2000, 10, 02);
		java.time.LocalDate d1=java.time.LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(d, d1));
	}

	public static LocalDate of(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	public static LocalDate now() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isBefore(LocalDate startofMonth) {
		// TODO Auto-generated method stub
		return false;
	}

}
