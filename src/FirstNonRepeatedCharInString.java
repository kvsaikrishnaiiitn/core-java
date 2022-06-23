import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		// String string = "I love Java and Swty";
		String string = "Java Hungry Blog Alive is Awesome";

		System.out.println(string.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(entry -> entry.getKey()).findFirst().get());
	}
}
