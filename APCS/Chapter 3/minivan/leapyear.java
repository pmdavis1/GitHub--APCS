/*
Peter Davis
9/18/17
Leap Year
*/

import java.util.Scanner;

public class leapyear{

	public static void main (String[] Args){

		int year;
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the leap year program!");
		System.out.println("What year would you like to know about? (after 1582 AD)");
		year = scan.nextInt();

			// First, the program tests if the object is in range (above 1582)
		if (year < 1582)
			System.out.println("Error. Year not in the correct range.");


			// Checks 2 conditions:
				//1. If it is divisible by 4 and not by 100
				//2. If it is divisible by 100 and also by 400
			// if one of them is true, it is a leap year
		else if ((((year%4) == 0) && ((year%100) != 0))  ||  (((year%100) == 0) && ((year%400) == 0)))

			System.out.println(year+" is a leap year");

			// If neither of the conditions are true, it is not a leap year
		else

			System.out.println(year+" is NOT a leap year");
			
}
}
