package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemoThree {

	public static void main(String[] args) {
		// print all the even numbers in an array list
		ArrayList<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(20);
		for (Integer I1 : l) {
			l1.add(I1*2);
		}
		System.out.println(l1);
	}

}
