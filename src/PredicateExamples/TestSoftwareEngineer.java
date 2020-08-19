package PredicateExamples;

import java.util.function.Predicate;

public class TestSoftwareEngineer {

	public static void main(String[] args) {
		Predicate<SoftwareEnginner> p = SoftwareEnginner -> SoftwareEnginner.age >= 18 && SoftwareEnginner.girlFriend == true;
		SoftwareEnginner[] list = {
				new SoftwareEnginner(25,true,"shayama"),
				new SoftwareEnginner(14,true,"rohan"),
				new SoftwareEnginner(19,false,"rama"),
				new SoftwareEnginner(26,true,"prabahas")
		};
		for(SoftwareEnginner a: list) {
			if(p.test(a)) {
				System.out.println(a);
			}
		}
		
	}

}
