package ch07;

import java.time.*;
import java.time.temporal.*;

public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2023, 11, 16);
		
		long workDays = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(workDays);
		
		
	}

}
