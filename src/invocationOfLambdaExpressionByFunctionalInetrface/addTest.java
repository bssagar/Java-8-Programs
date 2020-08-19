package invocationOfLambdaExpressionByFunctionalInetrface;

public class addTest {

	public static void main(String[] args) {
		addInterface i = new addImpl();
		i.add(10, 20);
	}

}
