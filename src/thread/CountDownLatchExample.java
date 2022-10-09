package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);

		Thread t1 = new Thread(new Work(1, latch, "Work1"));
		Thread t2 = new Thread(new Work(2, latch, "Work2"));
		Thread t3 = new Thread(new Work(3, latch, "Work3"));

		t1.start();
		/*
		 * try { t1.join(); } catch (InterruptedException e1) { e1.printStackTrace(); }
		 */
		t2.start();
		/*
		 * try { t2.join(); } catch (InterruptedException e1) { e1.printStackTrace(); }
		 */
		t3.start();

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(
				"CountDownLatchExample.main()...waited and completed " + Thread.currentThread().getName() + " thread.");

	}

}

class Work extends Thread {
	private int delay = -1;
	private CountDownLatch latch = null;
	private String name = null;

	public Work(int delay, CountDownLatch latch, String name) {
		this.delay = delay;
		this.latch = latch;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			System.out.println(name + " thread waiting for " + delay + " seconds");
			Thread.sleep(delay * 100);
			System.out.println(name + " countDown.");
			latch.countDown();
			// latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
