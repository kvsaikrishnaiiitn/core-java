package thread.executorservice.typeofpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import thread.executorservice.RunnableTask;

public class ScheduleThreadPool {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " is started...");

		/**
		 * Uses Delay Queue
		 * (10secs dealy task comes first and 10mins delay task comes next...)
		 * schedule
		 * scheduleAtFixedRate
		 * scheduleWithFixedDelay
		 */
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
		//To execute task after 10 seconds delay
		scheduledExecutorService.schedule(new RunnableTask(0), 10, TimeUnit.SECONDS);

		//To execute a task repeatedly after initial delay 10 seconds and after 5 seconds.
		scheduledExecutorService.scheduleAtFixedRate(new RunnableTask(1), 10, 5, TimeUnit.SECONDS);
		
		//To execute task repeatedly after initial delay 10 seconds and gap with 5 seconds for every execution completion
		scheduledExecutorService.scheduleWithFixedDelay(new RunnableTask(2), 10, 5, TimeUnit.SECONDS);
		

		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}
