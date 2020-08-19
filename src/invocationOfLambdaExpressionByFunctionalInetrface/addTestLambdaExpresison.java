package invocationOfLambdaExpressionByFunctionalInetrface;

public class addTestLambdaExpresison {

	public static void main(String[] args) {
		addInterface i = (a,b)->System.out.println("Sum is "+(a+b));
		i.add(100, 25);
	}

}
