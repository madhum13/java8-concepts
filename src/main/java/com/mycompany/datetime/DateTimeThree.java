package com.mycompany.datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeThree {

	public static void main(String[] args) {

		//calculate experience of an employee
		LocalDate currentDate = LocalDate.now();
		LocalDate startDate = LocalDate.of(2012, 04, 15);
		
		Period period = Period.between(startDate, currentDate); //
		System.out.printf("Total experience is %d years %d months %days", period.getYears(), period.getMonths(), period.getDays());
		
	}

}
