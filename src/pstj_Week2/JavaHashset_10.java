package pstj_Week2;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			String first = sc.next();
			String second = sc.next();

			set.add(first + " " + second);

			System.out.println(set.size());
		}

		sc.close();
	}
}