import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayListCheck {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add(null);
		al.add(null);

		System.out.println("ArrayListCheck.main()...al:" + al);

		LinkedList<String> ll = new LinkedList<>();
		ll.add("1");
		ll.add("2");
		ll.add(null);
		ll.add(null);

		System.out.println("ArrayListCheck.main()...ll:" + ll);

		HashSet<String> hs = new HashSet<>();
		hs.add("Test");
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));

		System.out.println("ArrayListCheck.main()...hs:" + hs);

		HashMap<String, String> hMap = new HashMap<>();
		System.out.println(hMap.put("1", "1"));
		System.out.println(hMap.put("2", "22"));
		System.out.println(hMap.put("2", "20"));

		System.out.println("ArrayListCheck.main()...hMap:" + hMap);
	}

}
