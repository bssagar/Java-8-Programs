package Streams;

import java.util.ArrayList;

public class StreamsDemoSix {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Sagar");
		l.add("Ram");
		l.add("Sam");
		l.add("Shrivatsa");
		long count = l.stream().filter(s -> s.length() >= 5).count();
		System.out.println("Count value is " + count);
	}

}
