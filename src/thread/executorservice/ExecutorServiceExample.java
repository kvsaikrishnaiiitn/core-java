package thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is started...");
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 10; i++) {
			//executorService.execute(new Task(i));
			executorService.submit(new RunnableTask(i));
		}

		executorService.shutdown();
		//executorService.shutdownNow();
		//executorService.shutdown(); - Not a problem
		System.out.println(Thread.currentThread().getName() + " is completed.");
	}
}
