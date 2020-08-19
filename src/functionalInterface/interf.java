package functionalInterface;

@FunctionalInterface
public interface interf {
	// its an functional interface
	// Only one single abstract method
	public void m1();

	// Any number of default methods
	default void m2() {

	}

	// Any number of static methods
	public static void m3() {

	}
}
