package invocationOfLambdaExpressionByFunctionalInetrface;

public class StringLengthTestLambda {

	public static void main(String[] args) {
		StringLength i = s->s.length();
		System.out.println(i.giveLength("SagarBS"));
	}

}
