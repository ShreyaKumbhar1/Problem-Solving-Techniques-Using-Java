package pstj_Week3;

import java.util.*;

public class SortThePeople_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] names = new String[n];
		int[] heights = new int[n];

		for (int i = 0; i < n; i++) {
			names[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (heights[i] < heights[j]) {
					int tempHeight = heights[i];
					heights[i] = heights[j];
					heights[j] = tempHeight;

					String tempName = names[i];
					names[i] = names[j];
					names[j] = tempName;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(names[i] + " ");
		}

		sc.close();
	}
}