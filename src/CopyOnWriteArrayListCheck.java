import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListCheck {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add(1);
		copyOnWriteArrayList.add(2);
		copyOnWriteArrayList.add(3);
		
		System.out.println(copyOnWriteArrayList);

	}

}
