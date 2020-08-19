package anonymousInnerClass;

public class ThreadsDemo {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i = 0 ; i < 10 ; i ++) {
					System.out.println("Child thread exeucting --"+i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println("Parent thread exeucting --"+i);
		}
	}

}
