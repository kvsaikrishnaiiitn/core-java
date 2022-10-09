package thread.executorservice.typeofpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import thread.executorservice.RunnableTask;

public class CachedThreadPool {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " is started...");

		/**
		 * Uses Synchronous Queue(Holds only 1 task)
		 * Check if any existing thread is free, then uses it
		 * Or creates a new thread and adds to pool
		 * And kills thread if more than idle for 60 seconds.
		 * Theoretically it's possible to have number of threads = number of tasks submission
		 */
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new RunnableTask(i));
		}

		executorService.shutdown();

		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}
