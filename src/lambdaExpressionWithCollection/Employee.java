package lambdaExpressionWithCollection;

public class Employee {
	 int eid;
	 String ename;

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return eid+":"+ename;
	}

}
