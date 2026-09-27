package pstj_Week3;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheYear_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String date = sc.next();

		LocalDate d = LocalDate.parse(date);

		System.out.println(d.getDayOfYear());

		sc.close();
	}
}