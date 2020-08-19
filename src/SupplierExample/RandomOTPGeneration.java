package SupplierExample;

import java.util.function.Supplier;

public class RandomOTPGeneration {

	public static void main(String[] args) {
		Supplier<Integer> s = ()->{
			String otp = "";
			for(int i = 0; i <6; i++) {
				otp = otp + (int)(Math.random()*10);
			}
			return Integer.parseInt(otp);
		};
		System.out.println(s.get());
	}

}
