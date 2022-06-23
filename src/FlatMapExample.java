import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {

		List<List<String>> names = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("John", "Michael"),
				Arrays.asList("Shawn", "Franklin"), Arrays.asList("Johnty", "Sean"));

		System.out.println(names);

		names.stream().flatMap(eachSubList -> eachSubList.stream()).map(String::toUpperCase).forEach(System.out::println);

	}

}
