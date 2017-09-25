
/*
*Peter Davis
*8/31/17
*/

import java.util.ArrayList;

public class ch2notes
{
	public static void main (String[] args){

	// --- .equals vs == ----

		String word = new String("Homer Simpson");
		String word1 = word;
		//word1 = "Homer Simpson"; //reassigning the variable changes the memory address
		System.out.println(word1);
		String word2 = new String("Homer Simpson");

		// .equals will compare the value of the object
		System.out.println(".equals(): " + word.equals(word2));
		// == looks to see if it is the SAME object
		System.out.println("==" + (word == word2));
		//System.out.println("==" + (word == word1));

// ---- Other String Methods ---
	String word3 = new String("Bart");
	String name = new String("Alexander M Kashyap");
	String lname = "Hayes",fname = "kevin",mname;

	fname = "Thomas"; //String is special define like primative data

	System.out.println(fname.length());
	System.out.println(name.replace('a','*' ));
	System.out.println(name.compareTo(fname));

// ---- Autobox ----

	int x = 9;
	int id = 789;
	double num = 5, num1 = 23.89765, num2 = 3.4;
	char letter = 'd';
	boolean choice;

	Integer number = new Integer(47);
	number = id; //autoboxing
	System.out.println(number);

	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.parseInt("56")); //turns a string into an integer
	System.out.println("56"+1); //doesn't add, it concantinates

	ArrayList<Integer> grades = new ArrayList<Integer>();

	}}