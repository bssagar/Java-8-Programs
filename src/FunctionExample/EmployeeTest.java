package FunctionExample;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		populate(empList);
		System.out.println(empList);
		Function<ArrayList<Employee>,Double> f = list->{
			double total = 0;
			for(Employee e : list) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("Total salary is "+f.apply(empList));
		System.out.println("*************");
		
		Predicate<Employee> p = emp -> emp.salary<100000;
		Function<Employee,Employee> f2 = e ->{
			e.salary = e.salary + 151;
			return e;
		};
		ArrayList<Employee> l2 = new ArrayList<>();
		for(Employee x: empList) {
			if(p.test(x)) {
				f2.apply(x);
				l2.add(x);
			}
		}
		System.out.println("new added salary added"+l2);
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Sagar",200000));
		list.add(new Employee("Nadendra",150000));
		list.add(new Employee("Moahn",100000));
		list.add(new Employee("Vikas",50000));
	}

}
