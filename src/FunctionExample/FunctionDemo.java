package FunctionExample;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// Functional interface - function 
		// to return the length of String 
		Function<String,Integer> f = s ->s.length();
		System.out.println(f.apply("SAGAR"));
		System.out.println(f.apply("NTT DATA"));
		
		Function<Integer,Integer> f2 = i ->i*i;
		System.out.println(f2.apply(5));
	}

}
