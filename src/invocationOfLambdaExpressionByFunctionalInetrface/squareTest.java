package invocationOfLambdaExpressionByFunctionalInetrface;

public class squareTest {

	public static void main(String[] args) {
		squareInterface i = x -> x * x;
		System.out.println("Square of number is " + i.square(5));
	}

}
