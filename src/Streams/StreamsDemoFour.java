package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoFour {

	public static void main(String[] args) {
		// print all the even numbers in an array list
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(20);
		List<Integer>l1 = l.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(l1);
	}

}
