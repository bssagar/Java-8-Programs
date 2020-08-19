package PredicateExamples;

public class SoftwareEnginner {
	String name;
	int age;
	boolean girlFriend;

	SoftwareEnginner(int age, boolean girlFriend, String name) {
		this.age = age;
		this.girlFriend = girlFriend;
		this.name = name;
	}

	@Override
	public String toString() {
		return "SoftwareEnginner [name=" + name + "]";
	}
}
