package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemoTwo {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		int dd = now.getDayOfMonth();
		int mm = now.getMonthValue();
		int yyyy = now.getYear();
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int min = time.getMinute();
		int second = time.getSecond();
		int nanoSecond = time.getNano();
		System.out.println();
		System.out.println(hour);
		System.out.println(min);
		System.out.println(second);
		System.out.println(nanoSecond);

	}

}
