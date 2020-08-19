package PredicateExamples;

import java.util.function.Predicate;

public class ProgramSix {

	public static void main(String[] args) {
		String[] names = { "Kareem", "Sunny", "Bunny", "Kareena", "Sagar" };
		Predicate<String> p = s -> s.charAt(0) == 'K';
		for (String a : names) {
			if (p.test(a)) {
				System.out.println("Name is " + a);
			}
		}
	}

}
