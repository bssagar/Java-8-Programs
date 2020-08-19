package TwoArguments;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemoTwo {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		BiFunction<String, Integer, Student> function = (name, rollnumber) -> (new Student(name, rollnumber));
		studentList.add(function.apply("Sagar", 10));
		studentList.add(function.apply("Ram", 20));
		System.out.println(studentList);
	}

}
