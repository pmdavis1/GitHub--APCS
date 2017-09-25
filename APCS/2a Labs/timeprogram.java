
/*
*Peter Davis
*8/30/17
*2.6
*Converts a time to seconds
*/

import java.util.Scanner;

public class timeprogram {

	public static void main (String[] args) {
		//initialize variables / instantiate objects
		Scanner schooner = new Scanner(System.in);
		int hours,minutes,seconds,total;

		// ---User input ---
		System.out.println("I wonder how the DOW is going. Anyway how many hours??????");
		hours = schooner.nextInt();
		System.out.println("How many minutes?");
		minutes = schooner.nextInt();
		System.out.println("How many seconds?");
		seconds = schooner.nextInt();

		// --- Calculate seconds given hours and print total time
		total = hours*3600 + minutes*60 + seconds;
		System.out.println("The total time is "+total+" seconds");


	}}