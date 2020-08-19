package ConsumerExample;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {

	public String name;
	public int marks;

	Student(String name, int marks) {
		this.marks = marks;
		this.name = name;
	}

	public static void main(String[] args) {
		ArrayList<Student> studentObject = new ArrayList<>();
		populate(studentObject);
		Predicate<Student> p = s -> s.marks >= 60;
		Function<Student, String> f = Student -> {
			int marks = Student.marks;
			if (marks >= 80) {
				return "A";
			} else if (marks >= 65) {
				return "B";
			} else {
				return "C";
			}
		};
		Consumer<Student> consumer = Objet -> {
			System.out.println("Name " + Objet.name);
			System.out.println("Marks " + Objet.marks);
			// function to check the grade
			System.out.println("Grade is " + f.apply(Objet));
			System.out.println();
		};
		for (Student x : studentObject) {
			// first predicate
			if (p.test(x)) {
				// consumer
				consumer.accept(x);
			}

		}
	}

	public static void populate(ArrayList<Student> studentObject) {
		studentObject.add(new Student("Sagar", 95));
		studentObject.add(new Student("Shrivatsha", 99));
		studentObject.add(new Student("Rahul", 65));
		studentObject.add(new Student("Kumar", 55));
	}

}
