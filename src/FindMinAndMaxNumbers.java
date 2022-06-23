import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMinAndMaxNumbers {

	public static void main(String[] args) {

		System.out.println(Stream.of(1, 2, 3, 77, 6, 5).sorted().max(Comparator.comparing(Integer::valueOf)).get());
		System.out.println(Stream.of(1, 2, 3, 77, 6, 5).sorted().min(Comparator.comparing(Integer::valueOf)).get());

		System.out.println(Stream.of(1, 2, 3, 77, 6, 5).min(Comparator.comparing(Integer::valueOf)));
		
		System.out.println(Stream.of(1, 2, 3, 77, 6, 5).min(Integer::compare));
		
		System.out.println(IntStream.of(1, 2, 3, 77, 6, 5).min());

	}

}
