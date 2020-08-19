package functionalInterface;

interface lengthInterface {
	public int length(String s);
}
public class Demo {

	public static void main(String[] args) {
		lengthInterface i = s -> s.length();
		System.out.println("The length returned is "+i.length("Java"));
	}

}
