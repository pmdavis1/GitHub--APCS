/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class ch3notesstartercode
{
public static void main (String [] args)
{

/**/
	   String word = "apple";
		String word1 = "cat";

		//compareTo is based on the FIRST in relation to the parameter
		if (word.compareTo(word1) < 0) //Can NOT put semicolon after if statement
		{
			System.out.println(word+" is before " +word1);
			System.out.println("and cats are evi");
		}
		else
			System.out.println(word1+" is before "+word);
		// only executes one line without {}
/*

      int num = 5, num1 =10, num2 = 4;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.readInt();

       System.out.print ("Enter a  second number ");
	   num1 = Keyboard.readInt();

       System.out.print ("Enter a  third number ");
	   num2 = Keyboard.readInt();

      System.out.println ();


/*  */

}// end of main


}// end of class









