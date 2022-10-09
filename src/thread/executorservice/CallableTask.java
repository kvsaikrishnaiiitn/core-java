package thread.executorservice;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	private int i;

	public CallableTask(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName() + "<=>" + i;
	}

}
