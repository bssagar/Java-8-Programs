package invocationOfLambdaExpressionByFunctionalInetrface;

public class StringLengthTest {

	public static void main(String[] args) {
		StringLength s = new StringLengthImpl();
		System.out.println("Length of String is "+ s.giveLength("Sagar"));
	}

}
