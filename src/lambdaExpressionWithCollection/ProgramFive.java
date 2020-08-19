package lambdaExpressionWithCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramFive {

	public static void main(String[] args) {
		/*
		 * Employee e1 = new Employee(1, "Ram"); System.out.println(e1);
		 */
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(2, "lakshman"));
		al.add(new Employee(4, "bharath"));
		al.add(new Employee(3, "hanuman"));
		al.add(new Employee(1, "ram"));
		System.out.println("ArrayList" + al);
		System.out.println("After the customised sorting descending order");
		Collections.sort(al, (obj1, obj2) -> obj1.eid > obj2.eid ? -1 : obj1.eid < obj2.eid ? +1 : 0);
		System.out.println(al);
		System.out.println("After the customised sorting ascending order");
		Collections.sort(al, (obj1, obj2) -> obj1.eid > obj2.eid ? +1 : obj1.eid < obj2.eid ? -1 : 0);
		System.out.println(al);

	}

}
