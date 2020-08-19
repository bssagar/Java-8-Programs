package functionalInterface;

@FunctionalInterface
public interface Interf2 {
	// Not a functional interface as we must have at least one abstract method
	default void m1() {

	}

	public static void m2() {

	}
}
