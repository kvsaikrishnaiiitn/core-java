import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithCustomSorting {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
		treeMap.put(5, 15);
		treeMap.put(1, 311);
		treeMap.put(3, 13);
		treeMap.put(2, 212);
		treeMap.put(4, 614);

		System.out.println(treeMap);

	}

}
