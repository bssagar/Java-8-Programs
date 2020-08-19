package TwoArguments;

import java.util.function.BiFunction;

public class BiFunctionDemoThree {

	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> function = (empObj, timeObj) -> empObj.dailyWage * timeObj.days;
		Employee emp = new Employee(10, "Sagar", 65000);
		TimeSheet time = new TimeSheet(10, 10);
		System.out.println(function.apply(emp, time));
	}

}
