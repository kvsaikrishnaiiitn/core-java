package thread;
public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		Runnable r = () -> System.out.println("Hello");
		Thread t = new Thread(() -> System.out.println("Hello"));
		t.start();
	}

}