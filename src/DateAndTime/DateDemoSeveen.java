package DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDemoSeveen {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}

}
