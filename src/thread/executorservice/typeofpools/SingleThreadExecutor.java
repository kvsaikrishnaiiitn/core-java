package thread.executorservice.typeofpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import thread.executorservice.RunnableTask;

public class SingleThreadExecutor {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " is started...");

		/**
		 * Uses Blocking Queue Fixed number of threads 
		 * To run thread sequentially
		 */
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new RunnableTask(i));
		}

		executorService.shutdown();

		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}
