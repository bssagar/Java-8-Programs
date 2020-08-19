package functionalInterfaceInheritance;

@FunctionalInterface
public interface interf3 {
	public void m1();
}

@FunctionalInterface
interface interf4 extends interf3 {
	public void m3();
	// in the child's functional inetrface we cannot have the new abstract method
	// as we are already extending the parent functional interface
}