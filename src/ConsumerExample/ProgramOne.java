package ConsumerExample;

import java.util.function.Consumer;

public class ProgramOne {

	public static void main(String[] args) {
		Consumer<String> c = String->System.out.println(String);
		c.accept("sagar");
	}

}
