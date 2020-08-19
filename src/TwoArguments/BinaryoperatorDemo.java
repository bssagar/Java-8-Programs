package TwoArguments;

import java.util.function.BinaryOperator;

public class BinaryoperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<String> operator = (s1, s2) -> s1 + s2;
		System.out.println(operator.apply("sagar", "bs"));
	}

}
