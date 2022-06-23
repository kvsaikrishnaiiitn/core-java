import java.io.FileWriter;
import java.io.IOException;

public class TryWithoutCatchOrFinally {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("try");
		}
		// System.out.println("In between");
		catch (Throwable t) {
			System.out.println("catch");
		}

		/*
		 * finally { System.out.println("finally"); }
		 */
		// FileWriter fileWrite = new FileWriter("/XXX");

		try (FileWriter fileWriter = new FileWriter("X")) {
			System.out.println("Inside");
			fileWriter.write("X");
		}

		/*
		 * try (File f = new File("X")) { System.out.println("Inside"); if (f.exists())
		 * { System.out.println("Exists"); } }
		 */

	}

}
