package functionalInterfaceInheritance;

@FunctionalInterface
public interface interf {
	public void m1();
}

@FunctionalInterface
interface interf2 extends interf {
	// the child interface is also an functional interface as
	// we are extending the parent interface which is also an functional interface
	// NOTE: we cannot use the keyword public on line number 9
	// if used error The public type interf2 must be defined in its own file
}
