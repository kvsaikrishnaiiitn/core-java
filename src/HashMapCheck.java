import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCheck {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Cms", "Cms");
		hashMap.put(null, "null");
		hashMap.put(null, "null2");
		
		System.out.println(hashMap.get("Cms"));

		System.out.println(hashMap);

		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("Cms", "Cms");
		//hashtable.put(null, null);

		System.out.println(hashtable.get("Cms"));
		
		System.out.println(hashtable);
		
		

		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("Cms", "Cms");
		//concurrentHashMap.put(null, null);

		System.out.println(concurrentHashMap.get("Cms"));
		
		System.out.println(concurrentHashMap);

	}
}
