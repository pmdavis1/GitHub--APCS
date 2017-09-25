/*
Peter Davis
9/18/17
Triangle
*/

import java.util.Scanner;

public class triangle {

	public static void main (String[] args) {

		double a,b,c,hyp,leg1,leg2;
		char choice;
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the trinagle program");
		System.out.println("Would you like to enter sides or angles? (enter 'S' or 'A')");
		choice = scan.next().charAt(0);

		//-------Code if the user enters sides ---------
		switch (choice)
		{
		case 'S':
		case 's':

			System.out.println("Please enter three sides");
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();

			if ((c > a + b) || (b > a + c) || (a > b + c) || ((a <= 0) || (b <= 0) || (c <= 0)))
				System.out.println("No possible triangle");
			else if ((a==b) && (b==c))
				System.out.println("Equilateral");
			else if ((a==b) || (b==c) || (a==c))
				System.out.println("Isosceles");
			else if (((Math.pow(a,2)) + (Math.pow(b,2))) == (Math.pow(c,2)) || ((Math.pow(a,2)) + (Math.pow(c,2))) == (Math.pow(b,2)) || ((Math.pow(b,2)) + (Math.pow(c,2))) == (Math.pow(a,2)))
				System.out.println("Right");
			else
				System.out.println("Scalene");

			break;

		case 'A':
		case 'a':

			System.out.println("Please enter three angles");
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();

			if ((a+b+c != 180) || ((a <= 0) || (b <= 0) || (c <= 0)))
				System.out.println("No possible triangle");
			else if ((a==b) && (b==c))
				System.out.println("Equilateral");
			else if ((a==b) || (b==c) || (a==c))
				System.out.println("Isosceles");
			else if ((a==90) || (b==90) || (c==90))
				System.out.println("Right");
			else
				System.out.println("Scalene");

			break;

		} //end of switch

} // end of main

}