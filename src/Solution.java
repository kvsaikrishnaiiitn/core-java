public class Solution {

	public static void main(String[] args) {
		// int[] A = { 1, 0, 1, 0, 11 };
//		int[] A = { 1, 1, 0, 1, 1 };
		int[] A = { 1, 1, 0, 1, 1 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int totalArrayLength = A.length;
		int result = 0;
		for (int index = 0; index < totalArrayLength - 1; index++) {
			if (A[index] == A[index + 1]) {
				result++;
			}
		}

		int rounds = -1;
		for (int index = 0; index < totalArrayLength; index++) {
			int count = 0;
			if (index > 0) {
				if (A[index - 1] != A[index]) {
					count++;
				} else {
					count--;
				}
			}

			if (index < totalArrayLength - 1) {
				if (A[index + 1] != A[index]) {
					count++;
				} else {
					count--;
				}
			}
			rounds = Math.max(rounds, count);
		}

		return totalArrayLength == 1 ? 0 : result + rounds;
	}
}