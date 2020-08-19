package lambdaExpressionWithCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramTwo {

	public static void main(String[] args) {
		// Sorting Elements of ArrayList with Lambda expression
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(0);
		i.add(5);
		i.add(40);
		i.add(25);
		System.out.println("Before sort--" + i);
		Collections.sort(i, (obj1, obj2) -> obj1 > obj2 ? -1 : obj1 < obj2 ? +1 : 0);
		System.out.println("After sorting " + i);
	}

}
