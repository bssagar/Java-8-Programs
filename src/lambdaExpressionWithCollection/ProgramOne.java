package lambdaExpressionWithCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramOne {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(0);
		i.add(5);
		i.add(40);
		i.add(25);
		System.out.println("Before sorting--" + i);
		Collections.sort(i);
		// Default natural sorting order - Ascending order for the number
		System.out.println("After sorting--" + i);
		// Compare method for newly defined sorting
		Collections.sort(i, new MyComparator());
		System.out.println("After Desecending sorting--" + i);
	}

}
