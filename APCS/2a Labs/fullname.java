/*
*Peter Davis
*9/4/17
*Asks for the users full name and splits it into first, middle, and last name
*/

/* Variables:
*scan = a scanner object
*name = the full name entered by the user
*firstmid = a substring containing the first and middle name
*midlast = a substring containing the middle and last name
*lastname = a substring containing only the last name
*firstspace = the index of the first space
*secondspace = the index of the second space
*/

import java.util.Scanner;


public class fullname {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		String name,midlast,lastname,firstmid;
		int firstspace, secondspace;

		System.out.println("Please enter your FULL name (first middle last)");
		name = scan.nextLine();

		//find the first space to know the index of the middle name
		firstspace = name.indexOf(' ');

		// to get the first name and middle initial: substring from 0 to (firstspace+2)
		firstmid = name.substring(0,(firstspace+2));
		midlast = name.substring((firstspace+1),name.length());

		//find the second space to know the index of the last name
		secondspace = midlast.indexOf(' ');
		lastname = midlast.substring((secondspace+1),midlast.length());


		System.out.println(firstmid+"."+"\n"+lastname);


	}}


	/*
	Please enter your FULL name (first middle last)
	Peter Mark Davis
	Peter M.
	Davis
	Press any key to continue . . .


	Please enter your FULL name (first middle last)
	Kevin T Hayes
	Kevin T.
	Hayes
	Press any key to continue . . .
*/