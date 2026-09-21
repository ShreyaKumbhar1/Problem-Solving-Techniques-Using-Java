package pstj_Week2;

import java.util.Scanner;

public class ShuffleTheArray_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] nums = new int[2 * n];
		int[] ans = new int[2 * n];

		for (int i = 0; i < 2 * n; i++) {
			nums[i] = sc.nextInt();
		}

		int index = 0;

		for (int i = 0; i < n; i++) {
			ans[index] = nums[i];
			ans[index + 1] = nums[i + n];
			index += 2;
		}

		for (int i = 0; i < 2 * n; i++) {
			System.out.print(ans[i] + " ");
		}

		sc.close();
	}
}