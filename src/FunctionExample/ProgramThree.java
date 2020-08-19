package FunctionExample;

import java.util.Scanner;
import java.util.function.Function;

public class ProgramThree {

	public static void main(String[] args) {
		Function<String,String> f1 = String->String.substring(0, 5);
		Function<String,String> f2 = String->String.toLowerCase();
		System.out.println("Enter the User Name");
		Scanner input = new Scanner(System.in);
		String userName = input.next();
		System.out.println("Enter the Password ");
		String password = input.next();
		input.close();
		if(f1.andThen(f2).apply(userName).equals("sagar") && password.length() >0) {
			System.out.println("Welcome sagar");
		}else {
			System.out.println("Invalid user");
		}
	}

}