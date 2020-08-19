package anonymousInnerClass;

public class ProgramTwo implements interf {
	
	public void m1(){
		System.out.println("i can override the default methods");
	}
	
	public static void main(String[] args) {
		ProgramTwo obj = new ProgramTwo();
		obj.m1();
	}
}
