package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What year is it?");
		int year = in.nextInt();
		double r1 = (year % 4);
		double r2 = (year % 100);
		double r3 = (year % 400);
		boolean leapYear = (r1 == 0 && r2 != 0 || r3==0);
		System.out.println(year + " is a leap year: " + leapYear);
		// TODO Auto-generated method stub

	}

}
