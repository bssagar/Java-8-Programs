package functionalInterfaceInheritance;

@FunctionalInterface
public interface P {
	public void m1();
}

@FunctionalInterface
interface C extends P {
	public void m1();
	// in the child interface we can have the same method signature
	// of that of the parents abstract method
}
