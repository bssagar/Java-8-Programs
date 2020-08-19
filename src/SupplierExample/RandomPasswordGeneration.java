package SupplierExample;

import java.util.function.Supplier;

public class RandomPasswordGeneration {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String password = "";
			Supplier<Integer> digit = ()->(int)(Math.random()*10);
			String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = ()->
					symbol.charAt((int)(Math.random()*29));
			for(int i = 1; i <=8;i++) {
				if(i%2 == 0) {
					password = password +digit.get();
				}else {
					password = password +c.get();
				}
			}
			return password;
		};
		System.out.println(s.get());
	}

}
