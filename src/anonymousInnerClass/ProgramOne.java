package anonymousInnerClass;

public class ProgramOne {

	int x = 999;

	interface InterfOne {
		public void m1();
	}

	public void m2() {
		int y = 888;
		InterfOne i = ()->{
			System.out.println("x is "+x);
			System.out.println("y is "+y);
			x = 1010;
			//y = 9696; this is error as local variables accessing from lambda expresison is final
		};
		i.m1();
	}

	public static void main(String[] args) {
		ProgramOne obj = new ProgramOne();
		obj.m2();
	}

}
