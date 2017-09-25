/*
*Peter Davis
*/

import java.util.Scanner;
import java.text.*;

public class ch2pro10
{
	public static void main (String[] args){
	System.out.println("Welcome to the triangle area program!!! :)");
	Scanner scan = new Scanner(System.in);
	double s,a,b,c,thing,area;

	System.out.println("Enter a side");
	a = scan.nextDouble();
	System.out.println("Enter a side");
	b = scan.nextDouble();
	System.out.println("Enter a side");
	c = scan.nextDouble();

	s = (a+b+c)/2;

	thing = s*(s-a)*(s-b)*(s-c);
	area = Math.sqrt(thing);

	System.out.printf ("The area of your triangle is %.2f",area);
}

}