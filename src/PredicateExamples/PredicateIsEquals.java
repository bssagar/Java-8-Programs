package PredicateExamples;

import java.util.function.Predicate;

public class PredicateIsEquals {
	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("JAVA8");
		// now p represents JAVA8
		//System.out.println(p.test("SAGAR"));
		//System.out.println(p.test("JAVA8"));
		
		Predicate<Employee> p1 = Predicate.isEqual(new Employee("Sagar", "Lead Developer", 100000, "Bangalore"));
		//System.out.println(p1.test(new Employee("Ram", "Manager", 200000, "Delhi")));
		Employee e = new Employee("Sagar", "Lead Developer", 100000, "Bangalore");
		System.out.println(p1.test(e));
	}
}
