import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListCheck {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add(1);
		copyOnWriteArrayList.add(2);
		copyOnWriteArrayList.add(3);

		System.out.println(copyOnWriteArrayList);

		for (Integer eachNumber : copyOnWriteArrayList) {
			if (eachNumber == 2) {
				copyOnWriteArrayList.remove(eachNumber);
				copyOnWriteArrayList.add(100);
			}
		}
		
		System.out.println("CopyOnWriteArrayListCheck.enclosing_method()...copyOnWriteArrayList:" + copyOnWriteArrayList);
		
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		for (Integer eachNumber : al) {
			if (eachNumber == 2) {
				System.out.println("Removing from al.");
				al.remove(eachNumber);
				//al.add(100);
			}
			//al.add(100);
		}
		System.out.println("CopyOnWriteArrayListCheck.enclosing_method()...al:" + al);
		

	}

}
