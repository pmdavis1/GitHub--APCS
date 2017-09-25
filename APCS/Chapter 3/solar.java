/*
Peter Davis
Solar System
*/

import java.util.Scanner;

public class solar {

	public static void main(String[] args)
	{
		double weight,new_weight;
		int choice;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your weight");
		weight = scan.nextDouble();

		System.out.println("\nEnter a celestial body:");
		System.out.print("1-----Moon\n2-----Mars\n3-----Jupiter\n");
		choice = scan.nextInt();

		switch (choice)
		{
		case 1:
			new_weight = weight*.17;
			break;
		case 2:
			new_weight = weight*.38;
			break;
		case 3:
			new_weight = weight*2.54;
			break;
		default:
			System.out.println("invalid choice");
			new_weight = weight;
			break;

		} //end of switch

		System.out.println("Your weight on that celestial body is "+new_weight+" pounds");

	} //end of main

}