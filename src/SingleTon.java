
public class SingleTon {

	private static volatile SingleTon INSTANCE = null;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (INSTANCE == null) {
			synchronized (SingleTon.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingleTon();
				}
			}
		}
		return INSTANCE;
	}

}
