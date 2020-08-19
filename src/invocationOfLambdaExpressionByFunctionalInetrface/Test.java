package invocationOfLambdaExpressionByFunctionalInetrface;

public class Test {

	public static void main(String[] args) {
		interf i = new Demo();
		i.m1();
	}
	// This is the normal approach where we have not used the concept
	// of the lambda expression
	// Step 1: create an functional interface
	// step 2: create an implementation class\
	// step 3: in the test class use the interface reference to hold the
	// implementation class
	// step 4: call the method using the interface reference
}
