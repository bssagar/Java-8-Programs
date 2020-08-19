package PredicateExamples;

import java.util.Scanner;
import java.util.function.Predicate;
                             
public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p = User -> User.userName.equals("Sagar") && User.password.equals("1234");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String userName = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		User user = new User(userName, password);
		sc.close();
		if (p.test(user)) {
			System.out.println("hello, Sagar");
		} else {
			System.out.println("Invalid user");
		}
	}

}
