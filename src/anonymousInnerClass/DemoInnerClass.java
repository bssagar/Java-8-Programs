package anonymousInnerClass;

interface interfi {
	public void m1();
}

public class DemoInnerClass {
	int x = 999;

	public void m2() {
		interf i = new interf() {
			int x = 888;

			public void m1() {
				System.out.println("x is " + x);
				System.out.println("Outer x is " + DemoInnerClass.this.x);
			}
		};
		i.m1();
	}

	public static void main(String[] args) {
		DemoInnerClass obj = new DemoInnerClass();
		obj.m2();
	}
}
