import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);

		Map<Integer, Integer> numbersMap = numbersList.stream().collect(Collectors.toMap(i -> i, i -> i));
		
		numbersMap = numbersList.stream().collect(Collectors.toMap(Integer::intValue, Integer::intValue));

		BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t + "->" + u);
			}
		};

		numbersMap.forEach(biConsumer);

		numbersMap.forEach((i, j) -> {
			System.out.println(i + "->" + j);
		});

		numbersMap.entrySet().forEach(e -> {
			System.out.println(e.getKey() + "->" + e.getValue());
		});

	}

}
