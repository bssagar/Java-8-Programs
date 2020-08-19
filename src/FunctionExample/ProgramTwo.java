
package FunctionExample;

import java.util.function.Function;

public class ProgramTwo {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i + i;
		Function<Integer, Integer> f2 = i -> i * i * i;
		System.out.println("AndThen--" + f1.andThen(f2).apply(2));
		System.out.println("Compose--" + f1.compose(f2).apply(2));
	}

}
