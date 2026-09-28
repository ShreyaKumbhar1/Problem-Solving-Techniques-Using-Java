package pstj_Week3;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheWeek_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();

		LocalDate date = LocalDate.of(year, month, day);

		System.out.println(date.getDayOfWeek().toString().substring(0, 1)
				+ date.getDayOfWeek().toString().substring(1).toLowerCase());

		sc.close();
	}
}