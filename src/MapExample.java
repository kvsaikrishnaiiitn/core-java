import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Saket", "Trevor", "Franklin", "Michael");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("-------------");
		names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
	}

}
