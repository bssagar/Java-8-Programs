package FunctionExample;

import java.util.function.Function;

public class ProgramFour {

	public static void main(String[] args) {
		Function<String,String> f = Function.identity();	
		System.out.println(f.apply("sagar"));
	}

}