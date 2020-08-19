package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoTwo {

	public static void main(String[] args) {
		// print all the even numbers in an array list
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		List<Integer> l1 = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(l);
		System.out.println();
		System.out.println(l1);
	}

}
