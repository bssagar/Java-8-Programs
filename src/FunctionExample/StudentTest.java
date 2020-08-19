package FunctionExample;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> obj = new ArrayList<>();
		populate(obj);
		Function<Student, String> f = Student -> {
			int marks = Student.marks;
			if (marks >= 80) {
				return "A Grade";
			} else if (marks >= 60) {
				return "B Grade";
			} else if (marks >= 50) {
				return "C Grade";
			} else {
				return "Fail";
			}
		};
		/*
		 * for (Student x : obj) { System.out.println(x.name);
		 * System.out.println(x.marks); System.out.println(f.apply(x));
		 * System.out.println(); }
		 */
		Predicate<Student> p = Student->Student.marks >=70;
		for(Student x:obj) {
			if(p.test(x)) {
				System.out.println(x.name);
				System.out.println(x.marks);
				System.out.println(f.apply(x));
			}
			
		}
	}

	public static void populate(ArrayList<Student> obj) {
		obj.add(new Student("Sagar", 90));
		obj.add(new Student("Mohan", 70));
		obj.add(new Student("Shyama", 50));
		obj.add(new Student("Vimal", 45));
	}

}
