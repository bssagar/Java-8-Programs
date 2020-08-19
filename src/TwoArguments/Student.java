package TwoArguments;

public class Student {
	public String name;
	public int rollnumber;

	Student(String name, int rollnumber) {
		this.name = name;
		this.rollnumber = rollnumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + "]";
	}

}
