package FunctionExample;

import java.util.function.Function;

public class FunctionChainingProgramOne {

	public static void main(String[] args) {
		Function<String, String> f1 = String -> String.toUpperCase();
		Function<String, String> f2 = String -> String.substring(0, 9);
		System.out.println(f1.apply("rollsroycephantom"));
		System.out.println(f2.apply("rollsroycephantom"));
		System.out.println(f1.andThen(f2).apply("rollsroycephantom"));
		System.out.println(f1.compose(f2).apply("rollsroycephantom"));
	}

}
