package thread.executorservice;

public class MultipleNormalThreads {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " is started...");

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new RunnableTask(i));
			t.start();
		}

		/*
		 * try { System.out.println(Thread.currentThread().getName() +
		 * " sleeping for 10 secs..."); Thread.sleep(10 * 1000);
		 * System.out.println(Thread.currentThread().getName() +
		 * " sleeping for 10 secs completed."); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		System.out.println(Thread.currentThread().getName() + " is completed.");
	}
}
