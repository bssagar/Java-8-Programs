package functionalInterfaceInheritance;

@FunctionalInterface
public interface interf5 {
	public void m1();
}

interface interf6 extends interf5 {
	public void m2();

	public void m3();
	// this is valid as the child interface we have not annotated with the
	// annotation @FunctionalInterface

}