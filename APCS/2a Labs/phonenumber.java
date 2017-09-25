
/*
*Peter Davis
*8/30/17
*2.9
*Makes a random phone number
*/

/* VARIABLES:
*num1,num2,num3 = the first 3 digits of the phone number
*group2 = the second group of 3 numbers (digits 4-6 of the phone number)
*group3 = the group of four numbers in the phone number (digits 7-10)
*/

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class phonenumber {

	public static void main (String[] args){
		System.out.println("Welcome to the random phone number program!");

		//initializing variables and objects
		int num1,num2,num3,group2,group3;
		Random rand = new Random();
		DecimalFormat zeros3 = new DecimalFormat("000");
		DecimalFormat zeros4 = new DecimalFormat("0000");
		Scanner scan = new Scanner(System.in);

		//Random object generates three numbers between 0 and 7
		num1 = rand.nextInt(8);
		num2 = rand.nextInt(8);
		num3 = (int)(Math.random()*7+1);

		//Math.random() to generate the second set of digits
		group2 = (int)(Math.random()*743+1);
		group3 = rand.nextInt(10000);

		//string formatting to print the output
		System.out.print("Here is your phone number: ");
		System.out.printf("%d%d%d-"+zeros3.format(group2)+"-"+zeros4.format(group3)+"\n", num1,num2,num3);

	}}

	/* ------------output 1-------------

		Welcome to the random phone number program!
		Here is your phone number: 337-426-9126
		Press any key to continue . . .


		--------------output 2-----------

		Welcome to the random phone number program!
		Here is your phone number: 114-521-9119
		Press any key to continue . . .


	*/
