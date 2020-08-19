package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoFive {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Sagar");
		l.add("Ram");
		l.add("Sam");
		l.add("Shrivatsa");
		// concept of filter
		List<String> l1 = l.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
		System.out.println(l1);
		// concept of mapping
		List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
	}

}
