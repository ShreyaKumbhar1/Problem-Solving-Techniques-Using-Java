package pstj_Week2;

import java.util.Scanner;

public class FindTheHighestAltitude_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] gain = new int[n];

		for (int i = 0; i < n; i++) {
			gain[i] = sc.nextInt();
		}

		int altitude = 0;
		int highest = 0;

		for (int i = 0; i < n; i++) {
			altitude += gain[i];
			if (altitude > highest) {
				highest = altitude;
			}
		}

		System.out.println(highest);

		sc.close();
	}
}