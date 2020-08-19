package lambdaExpressionWithCollection;

import java.util.TreeMap;

public class ProgramFour {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "java");
		tm.put(10, "python");
		tm.put(7, "javascript");
		tm.put(3, "html");
		System.out.println("Default natural order sorting is " + tm);
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
				(obj1, obj2) -> obj1 > obj2 ? -1 : obj1 < obj2 ? +1 : 0);
		treeMap.put(1, "java");
		treeMap.put(10, "python");
		treeMap.put(7, "javascript");
		treeMap.put(3, "html");
		System.out.println("Customized order sorting is " + treeMap);
	}

}
