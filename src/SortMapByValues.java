import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapByValues {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new LinkedHashMap<>();
		map.put(1, 10);
		map.put(5, 8);
		map.put(3, 8);
		map.put(2, 9);

		System.out.println("map:" + map);

		TreeMap<Integer, Integer> treeMap = new TreeMap<>(map);
		System.out.println("treeMap:" + treeMap);

		List<Entry<Integer, Integer>> entriesList = new ArrayList(map.entrySet());
		System.out.println("entriesList:" + entriesList);

		Collections.sort(entriesList, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if (o1.getValue().equals(o2.getValue())) {
					return o1.getKey().compareTo(o2.getKey());
				} else {
					return o1.getValue().compareTo(o2.getValue());
				}
			}
		});

		System.out.println("sorted entriesList:" + entriesList);

		LinkedHashMap<Integer, Integer> newMap = new LinkedHashMap<>();
		for (Entry<Integer, Integer> eachEntry : entriesList) {
			newMap.put(eachEntry.getKey(), eachEntry.getValue());
		}
		System.out.println("newMap:" + newMap);

	}

}
