package MethodReference;

interface Interf {
	public void m1();
}

public class MethodReferenceDemoOne {

	public static void m2() {
		System.out.println("Method Reference");
	}

	public static void main(String[] args) {
		Interf i = MethodReferenceDemoOne::m2;
		i.m1();
	}

}
