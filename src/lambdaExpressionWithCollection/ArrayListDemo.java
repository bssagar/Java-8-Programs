package lambdaExpressionWithCollection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// ArrayList to hold he String objects
		// Here <String> is Generics concept
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("JavaScript");
		al.add("R");
		al.add("Java");
		System.out.println("Arraylist--"+al);
	}

}
