
public class EvenOrAddWithoutModulus {
	
	public static void main(String[] args) {
		int n = 3;
		int quotient = n/2;
		
		System.out.println((quotient * 2)==n);
		
		System.out.println((n & 1)==0);
	}

}
