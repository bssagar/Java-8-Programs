package StreamsConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		// Print only with Name starting from A
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		// Print only with Name starting from A & convert into upper case
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		// To sort the members
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		// usage of Stream's .collect() method
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		// Streams .match example
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
		// Streams .count method()
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched);
		// Stream.findFirst()
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();
		System.out.println(firstMatchedName);

	}

}
