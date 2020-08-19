package anonymousInnerClass;

interface interfOne {
	public void m1();
}

public class DemoInnerClasslambdaExpression {
	int x = 999;

	public void m2() {
		interfOne i = () -> {
			int x = 888;
			System.out.println("value of x is " + this.x);
		};
		i.m1();
	}

	public static void main(String[] args) {
		DemoInnerClasslambdaExpression obj = new DemoInnerClasslambdaExpression();
		obj.m2();
	}

}
