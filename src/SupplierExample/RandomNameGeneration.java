package SupplierExample;

import java.util.function.Supplier;

public class RandomNameGeneration {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String[] names = {"sagar", "shrivatsa","ram","vijay"};
			int index = (int)(Math.random()*4);
			return names[index];
		};
		System.out.println(s.get());
	}

}
