
// Java program for the above approach
import java.util.HashMap;

public class GFG2 {

// Function to find sum of digits
	int digitSum(long n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

// Function to find maximum sum pair
// having the same sum of digits
	int findMax(int[] arr, int n) {

		// Map to store the sum of digits
		// in a number as the key and
		// the maximum number having
		// that sum of digits as the value
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int ans = -1, pairi = 0, pairj = 0;
		for (int i = 0; i < n; i++) {

			// Store the current sum of digits
			// of the number in temp
			int temp = digitSum(arr[i]);

			// If temp is already present
			// in the map then update
			// ans if the sum is greater
			// than the existing value
			if (mp.containsKey(temp)) {
				if (arr[i] + mp.get(temp) > ans) {
					pairi = arr[i];
					pairj = mp.get(temp);
					ans = pairi + pairj;
				}
				mp.put(temp, Math.max(arr[i], mp.get(temp)));
			} else
				// Change the value in the map
				mp.put(temp, arr[i]);

		}

		return ans;
	}

// Driver Code Starts.
	public static void main(String[] args) {

		GFG2 gfg = new GFG2();
		//int[] A = { 51, 71, 17, 42 };
		 //int[] A = { 42, 33, 60 };
		int[] A = { 51, 32, 43 };
		System.out.println(gfg.solution(A));
	}

	public int solution(int[] A) {
		int n = A.length;
		return findMax(A, n);
	}

}
