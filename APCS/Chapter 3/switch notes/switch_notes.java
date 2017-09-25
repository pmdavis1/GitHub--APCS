

/**
 * Peter Davis
 */

import java.util.Scanner;

public class switch_notes

{

    public static void main (String[] args) 
    {
        double num,num1,num2;
        Scanner keyboard = new Scanner(System.in);
        final double TOLERANCE = .001;
        
        System.out.print("How much money do I have in my pocket");
        num1 = .01*1 + .05*2 + .1*3 + .25*4;
        num2 = keyboard.nextDouble();
        
        if (Math.abs(num1-num2) < TOLERANCE)
        {
            System.out.print("Good guess");
        }
        else
        {
            System.out.print("Nah");
        }
        
        /*

        char choice;
        
        System.out.println("What would you like to buy?");
        
        System.out.println("F) Fries .99");
        
        System.out.println("H) Hot Dog 1.45");
        
        System.out.println("S) Small Drink 1.50");
        
        //this is a string, using charAt makes it an integer
        choice = keyboard.next().charAt(0);
        
        //choice can be an int, char, and Java 7(8 maybe) String
        switch (choice)
        {
        case'F':
        case'f':
        System.out.println(".99");
        break;
        
        case'H':
        case'h':
        System.out.println("1.45");
        break;
        
        case'S':
        case's':
        System.out.println("1.50");
        break;
        }
        
        */

    }

}
