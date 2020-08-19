package invocationOfLambdaExpressionByFunctionalInetrface;

public class addImpl implements addInterface {

	@Override
	public void add(int a, int b) {
		System.out.println("Sum is " + (a + b));
	}

}
