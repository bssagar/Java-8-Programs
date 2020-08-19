package invocationOfLambdaExpressionByFunctionalInetrface;

public class WithLambdaExpression {

	public static void main(String[] args) {
		interf i = () -> System.out.println("inside the m1 method implmentation");
		i.m1();
		// for the interface reference we are implementing an lambda expression
		// clearly we are removing the implementation class,
		// and adding the lambda expression
	}

}
