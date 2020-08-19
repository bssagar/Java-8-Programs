package PredicateExamples;

import java.util.function.Predicate;

public class ProgramTwo {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length()>10;
		System.out.println(p.test("SAGAR"));
		System.out.println(p.test("ABCDEFGHIJKLMNOP"));
	}

}
