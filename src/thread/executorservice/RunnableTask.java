package thread.executorservice;

public class RunnableTask implements Runnable {
	
	private int i;

	public RunnableTask(int i) {
		this.i = i;
	}

	@Override
	public void run() {

		System.out.println("I'm:" + Thread.currentThread().getName() + "<=>" + i);
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}
