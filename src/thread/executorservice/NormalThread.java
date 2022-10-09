package thread.executorservice;

public class NormalThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is started.");

		Thread t = new Thread(new RunnableTask(0));
		t.start();

		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}