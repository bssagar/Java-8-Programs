package invocationOfLambdaExpressionByFunctionalInetrface;

interface samInterface {
	public void square(int i);

}

public class SAMTest {

	public static void main(String[] args) {
		samInterface s = i -> System.out.println("square is " + (i * i));
		s.square(2);
	}

}
