import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfEachCharacterInString {

	public static void main(String[] args) {

		String string = "Test string to be checked";
		Map<Character, Long> eachCharCount = string.chars().mapToObj(i -> Character.valueOf((char) i))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		/*
		 * System.out.println(string.chars().mapToObj(i -> Character.valueOf((char) i))
		 * .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
		 * Collectors.counting())));
		 */

		System.out.println(eachCharCount);

	}

}
