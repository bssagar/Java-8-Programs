package TwoArguments;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerDemoTwo {

	public static void main(String[] args) {
		ArrayList<EmployeeTwo> empList = new ArrayList<>();
		BiFunction<String, Double, EmployeeTwo> function = (name, salary) -> new EmployeeTwo(name, salary);
		empList.add(function.apply("Sagar", 25000.0));
		empList.add(function.apply("Ram", 15000.0));
		BiConsumer<EmployeeTwo, Double> c = (e, increment) -> e.salary = e.salary + increment;
		for (EmployeeTwo x : empList) {
			c.accept(x, 500.00);
		}
		for (EmployeeTwo x : empList) {
			System.out.println("Name--"+x.name+",Salary--"+x.salary);
		}
	}

}
