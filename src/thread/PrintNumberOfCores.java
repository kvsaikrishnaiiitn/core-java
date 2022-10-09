package thread;

public class PrintNumberOfCores {

	public static void main(String[] args) {
		System.out.println("Number of cores:" + Runtime.getRuntime().availableProcessors());
	}

}
