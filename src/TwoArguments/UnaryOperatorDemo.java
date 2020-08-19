package TwoArguments;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<Integer> o = i -> i * i;
		System.out.println(o.apply(12));
	}

}
