import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsIteration {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		// numbersList.stream().forEach(System.out::println);
		numbersList.forEach(System.out::println);

		System.out.println("-------------------------");

		Set<Integer> numbersSet = new HashSet<>(numbersList);
		numbersSet.forEach(System.out::println);

		System.out.println("-------------------------");

		Map<Integer, Integer> numbersMap = new HashMap<>();
		numbersMap.put(1, 1);
		numbersMap.put(2, 2);
		numbersMap.put(3, 3);
		numbersMap.put(4, 4);
		numbersMap.put(5, 5);

		// numbersMap.keySet().forEach(System.out::println);
		numbersMap.entrySet().forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));

	}

}
