//Peter Davis
//date
//example 1.1
//first program to test output

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.*; // imports anything you use in the program. util.* also works

public class firstprogram			//must have a class that matches the file name
{final static double PI = 3.1415; //final - makes a constant. The variable is outside of main in this case
public static void main (String[] args)	// must have main
{
	Scanner keyboard = new Scanner(System.in);
	double num;
	String name;
	//page 93-95
	DecimalFormat fmt2d = new DecimalFormat("0.##");

	System.out.println("What is your name?");
	name = keyboard.nextLine();

	System.out.println ("Enter a number");
	num = keyboard.nextInt(); // a double will hold an int but not vise versa

	//Math class does not need to be imported
	//Math is static - no object needed - p88
	//Math helper = new(Math) - error

	double num2 = Math.pow(num,6);

	System.out.println(num + " to the power of 6 = " + fmt2d.format(num2));
	System.out.printf("%.1f to the power of 6 = $%.2f \n", num,num2);

	System.out.printf("Thank you %s \n",name);

	//-----------------promotion

	int x,y;
	x = 2;y =5;
	num = x/y; // "=" has the lowest precedence. will return 0
	num = 7/21.0; // promotes 7 to a double.
	//---------Casting
	num = x/(double)y; //casts y to be a double, returns .4 double

	char a='A', b='B';
	int c;
	c = a+(char)40;


	System.out.println((char)c);

}//end of main

public static void foo()
{
	System.out.println("Hi");
}
}//end of class lincolin

//---------commenting out code:

/*
System.out.println("Hello");

/**/