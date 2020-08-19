package lambdaExpressionWithCollection;

import java.util.TreeSet;

public class ProgramThree {

	public static void main(String[] args) {
		// TreeSet for Natural default order sorting
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(50);
		ts.add(30);
		ts.add(45);
		System.out.println("TreeSet is "+ts);
		TreeSet<Integer> treeset = new TreeSet<Integer>((obj1,obj2)-> obj1>obj2?-1:obj1<obj2?+1:0);
		treeset.add(10);
		treeset.add(2);
		treeset.add(50);
		treeset.add(30);
		treeset.add(45);
		System.out.println("TreeSet is after sorting "+treeset);
	}

}
