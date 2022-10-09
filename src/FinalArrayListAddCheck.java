import java.util.ArrayList;

public class FinalArrayListAddCheck {
	public static void main(String[] args) {
		final ArrayList<Integer> al = new ArrayList<>();
		for (int index = 0; index < 1000; index++) {
			al.add(index);
		}
		System.out.println("FinalArrayListAddCheck.main()...al:" + al);
	}
}
