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
		System.out.print("1-----Moon\n2-----Mercury\n3-----Venus\n4-----Mars\n5-----Jupiter\n6-----Saturn\n7-----Uranus\n8-----Neptune");
		choice = scan.nextInt();

		switch (choice)
		{
		case 1:
			new_weight = weight*.17;
			break;
		case 2:
			new_weight = weight*.378;
			break;
		case 3:
			new_weight = weight*.907;
			break;
		case 4:
			new_weight = weight*.377;
			break;
		case 5:
			new_weight = weight*2.364;
			break;
		case 6:
			new_weight = weight*.916;
			break;
		case 7:
			new_weight = weight*.889;
			break;
		case 8:
			new_weight = weight*1.125;
			break;
		default:
			System.out.println("invalid choice");
			new_weight = weight;
			break;

		} //end of switch

		System.out.println("Your weight on that celestial body is "+new_weight+" pounds");

	} //end of main

}