package FunctionExample;

import java.util.function.Function;

public class ProgramOne {
	public static void main(String[] args) {
		String s1 = "This is Sagar from NTT DATA";
		Function<String,String> f = String->String.replaceAll(" ","");
		//System.out.println(f.apply(s1));
		
		String s2 = "This is Sagar from NTT DATA";
		Function<String,Integer> f2 = s3 -> s3.length() - s3.replaceAll(" ", "").length();
		System.out.println(f2.apply(s2));
	}
}
