package invocationOfLambdaExpressionByFunctionalInetrface;

public class StringLengthImpl implements StringLength {

	@Override
	public int giveLength(String s) {
		return s.length();
	}

}
