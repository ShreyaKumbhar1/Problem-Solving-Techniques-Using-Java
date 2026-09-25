package pstj_Week2;

import java.util.*;

public class TopKFrequentElements_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		list.sort((a, b) -> b.getValue() - a.getValue());

		for (int i = 0; i < k; i++) {
			System.out.print(list.get(i).getKey() + " ");
		}

		sc.close();
	}
}