package thread.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceWithCallableExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is started...");
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		List<Future<String>> allFutures = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Future<String> future = executorService.submit(new CallableTask(i));
			allFutures.add(future);
		}
		// We can perform unrelated operations

		for (int i = 0; i < 10; i++) {
			Future<String> future = allFutures.get(i);
			try {
				// Blocking operation
				String futureResult = future.get();
				System.out.println("future.isDone():" + future.isDone());
				System.out.println("futureResult(" + i + "):" + futureResult);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		System.out.println("ExecutorServiceWithCallableExample.main()...executorService.isShutdown():"
				+ executorService.isShutdown());

		executorService.shutdown();

		System.out.println("ExecutorServiceWithCallableExample.main()...executorService.isShutdown():"
				+ executorService.isShutdown());
		System.out.println(Thread.currentThread().getName() + " is completed.");
	}
}
