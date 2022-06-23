import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithCustomComparator {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(2);

		System.out.println(treeSet);

	}

}
