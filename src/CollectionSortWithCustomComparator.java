import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		Collections.sort(numbers, Comparator.naturalOrder());
		System.out.println(numbers);

	}

}
