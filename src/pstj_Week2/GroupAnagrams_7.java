package pstj_Week2;

import java.util.*;

public class GroupAnagrams_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] strs = new String[n];

		for (int i = 0; i < n; i++) {
			strs[i] = sc.next();
		}

		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(word);
		}

		for (ArrayList<String> group : map.values()) {
			System.out.println(group);
		}

		sc.close();
	}
}