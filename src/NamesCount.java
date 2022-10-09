import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NamesCount {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram", "Venkat", "Venkat", "Pushpinder");

		Map<String, Long> eachNameCountMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(eachNameCountMap);

	}

}
