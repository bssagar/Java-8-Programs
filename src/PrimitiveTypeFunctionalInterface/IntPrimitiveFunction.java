package PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntPrimitiveFunction {

	public static void main(String[] args) {
		IntFunction<Integer> function = i -> i * i;
		System.out.println(function.apply(5));

		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("sagar"));

		IntToDoubleFunction f2 = i -> Math.sqrt(i);
		System.out.println(f2.applyAsDouble(10));
	}

}
