package anonymousInnerClass;

interface InterfStatic {
	public static void m1() {
		System.out.println("intrface static method");
	}
}
public class ClassTest {

	public static void main(String[] args) {
		InterfStatic.m1();
		ClassTest obj = new ClassTest();
	}

}
