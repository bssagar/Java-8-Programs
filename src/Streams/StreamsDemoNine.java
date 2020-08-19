package Streams;

import java.util.ArrayList;

public class StreamsDemoNine {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("BB");
		l.add("CCC");
		l.stream().forEach(s -> System.out.println(s));
		// by the method reference concept
		l.stream().forEach(System.out::println);
	}

}
