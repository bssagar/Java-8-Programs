package DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class DateDemoFive {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1990, 9, 13);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Your age is %d years % d months and %d date ", p.getYears(), p.getMonths(), p.getDays());
	}

}
