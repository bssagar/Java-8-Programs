package lambdaExpressionWithCollection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Python");
		hs.add("JavaScript");
		hs.add("R");
		hs.add("Java");
		System.out.println("HashSet--" + hs);

	}

}
