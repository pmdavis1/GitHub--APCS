
/*
*Peter Davis
*8/30/17
*2.12
*/


import java.util.Scanner;
import java.text.NumberFormat;

public class coins {
	public static void main (String[] args) {

		double quarters,dimes,nickels,pennies,total;  // gotta intilialize variables
		NumberFormat money = NumberFormat.getCurrencyInstance(); // numberformat object

		Scanner scan = new Scanner(System.in);

		//
		System.out.println("Welcome to the coins program\nPlease enter the number of quarters"); // get that user input
		quarters = scan.nextDouble();
		System.out.println("Please enter the number of dimes");
		dimes = scan.nextDouble();
		System.out.println("Please enter the number of nickels");
		nickels = scan.nextDouble();
		System.out.println("Please enter the number of pennies");
		pennies = scan.nextDouble();

		// use basic mathematics to acquire the total
		total = quarters*.25 + dimes*.10 + nickels*.05 + pennies*.01;
		//numberformat money gives it a dollar sign
		System.out.println("You have "+ money.format(total)+". Congrats. You did it.");



	}

}