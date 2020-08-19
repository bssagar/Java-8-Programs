package invocationOfLambdaExpressionByFunctionalInetrface;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// This is called as trhe Job of the thread
		for(int i = 0; i <10;i++) {
			System.out.println("Child Thread "+i);
		}
	}

}
