package PredicateExamples;

import java.util.function.Predicate;

public class ProgramThree {
	
	public static void main(String[] args) {
		Predicate<Integer> p1 = I -> I>10; 
		Predicate<Integer> p2 = I -> I % 2 == 0;
		System.out.println("Predicate Joining AND " + p1.and(p2).test(30));
	}
	
}
