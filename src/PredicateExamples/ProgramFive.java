package PredicateExamples;

import java.util.function.Predicate;

public class ProgramFive {

	public static void main(String[] args) {
		int[]x = {5,10,15,20,25,30,35,40};
		Predicate<Integer> p1 = I->I>10;
		Predicate<Integer> p2 = I->I%2==0;
		method(p1,x);
		System.out.println("============");
		method(p1.and(p2),x);
		System.out.println("****");
		method(p1.and(p2).negate(),x);
	}

	public static void method(Predicate<Integer> p1, int[] x) {
		for(int a : x) {
			if(p1.test(a)) {
				System.out.println(a);
			}
		}
	}

}
