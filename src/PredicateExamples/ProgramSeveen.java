package PredicateExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ProgramSeveen {

	public static void main(String[] args) {
		String[] names = { "Kareem", "Sunny", "", "   ", null, null };
		ArrayList<String> al = new ArrayList<>();
		Predicate<String> p = s -> s != null && s.length() > 0;
		for (String a : names) {
			if (p.test(a)) {
				al.add(a);
			} 
		}
		System.out.println("New list is " + al);
	}
}
