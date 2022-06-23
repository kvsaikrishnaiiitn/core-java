
public class CharToInt {

	public static void main(String[] args) {
		/*
		 * char a = 'a'; System.out.println((int) a);
		 * 
		 * char z = 'z'; System.out.println((int) z);
		 * 
		 * int ia = 97; System.out.println((char) ia);
		 * 
		 * int iz = 122; System.out.println((char) iz);
		 */

		for (int i = (int) 'a'; i <= (int) 'z'; i++) {
			// System.out.println("i:" + i + ", char:" + (char) i);
			// System.out.println(i + ":" + (char) i);
			System.out.println(i + ":" + Character.valueOf((char) i));
		}

	}

}
