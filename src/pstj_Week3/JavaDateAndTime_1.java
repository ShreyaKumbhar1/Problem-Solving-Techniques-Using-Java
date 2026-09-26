package pstj_Week3;

import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);

		String[] days = {
			"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
			"THURSDAY", "FRIDAY", "SATURDAY"
		};

		System.out.println(days[cal.get(Calendar.DAY_OF_WEEK) - 1]);

		sc.close();
	}
}