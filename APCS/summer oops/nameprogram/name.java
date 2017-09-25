

/**
 * Write a description of class name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class name
{
    public static void main (String[] args) {
        
        String myname = new String("Peter");
        String yourname;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Please enter your name");
        yourname = scan.nextLine();
        
        char char1 = myname.charAt(0);
        char char2 = yourname.charAt(0);
        System.out.println(char1);
        
        if (char1 >= char2)
            System.out.println (yourname+"\n"+myname);
       else
            System.out.println (myname+"\n"+yourname);
}
}