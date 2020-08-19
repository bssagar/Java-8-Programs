package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemoSeveen {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(21);
		l.add(16);
		System.out.println(l);
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println();
		System.out.println(l1);
		// List<Integer> l2 = l.stream().sorted((i1, i2) ->
		// -i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> l2 = l.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println();
		System.out.println(l2);
	}

}
