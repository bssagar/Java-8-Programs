package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemoOne {

	public static void main(String[] args) {
		// print all the even numbers in an array list
		ArrayList<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		for (Integer I1 : l) {
			if (I1 % 2 == 0) {
				l1.add(I1);
			}
		}
		System.out.println(l1);
	}

}
