import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortWithCustomComparator {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList();
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5);

		System.out.println(numbers);
		// Collections.sort(numbers, Comparator.reverseOrder());
		Collections.sort(numbers, (i, j) -> j - i);
		System.out.println(numbers);

	}

}
