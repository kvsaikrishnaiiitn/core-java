import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachStringInList {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Java", "Spring", "SpringBoot", "Java", "Microservices");

		Map<String, Long> eachNameCount = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		eachNameCount.entrySet().forEach(e -> {
			System.out.println(e.getKey() + "->" + e.getValue());
		});

	}

}
