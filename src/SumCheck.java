import java.util.stream.Stream;

public class SumCheck {

	public static void main(String[] args) {
		System.out.println(Stream.of(1, 2, 3, 4, 5).mapToInt(i -> i).sum());
	}

}
