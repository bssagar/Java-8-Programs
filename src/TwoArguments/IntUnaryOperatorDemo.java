package TwoArguments;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {

	public static void main(String[] args) {
		IntUnaryOperator o = i -> i * i;
		System.out.println(o.applyAsInt(14));
	}

}
