import java.util.Arrays;
import java.util.List;

public class SquaresOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 11, 33, 55);
		numbers.stream().map(i -> i * i).filter(y -> y > 100).forEach(System.out::println);
		// mapToInt(x -> x).average());
	}

}
