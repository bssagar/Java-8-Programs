package Streams;

import java.util.ArrayList;

public class StreamsDemoTen {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(21);
		l.add(16);
		System.out.println(l);
		Integer[] array = l.stream().toArray(Integer[]::new);
		for (Integer x : array) {
			System.out.println(x);
		}
	}

}
