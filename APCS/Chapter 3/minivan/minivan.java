

/**
 * Peter Davis
 * September 22, 2017
 * Mini Van
 */

import java.util.Scanner;

public class minivan
{
    public static void main(String[] args){
    
        String input;
        char dl,dr,cl,mu,il,ir,ol,or,gear;
        boolean left = false, right = false;
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("Please enter the 9-digit input (no spaces)");
        input = scan.nextLine();
        
        dl = input.charAt(0);
        dr = input.charAt(1);
        cl = input.charAt(2);
        mu = input.charAt(3);
        il = input.charAt(4);
        ir = input.charAt(5);
        ol = input.charAt(6);
        or = input.charAt(7);
        gear = input.charAt(8);
        
        
        if ((gear != 'p') || (mu == '0'))
        {
            left = false;
            right = false;
        }
        else if (cl == '0')
        {
            if (dl == '1')
                left = true;
            if (dr == '1')
                right = true;
            if (il == '1')
                left = true;
            if (ir == '1')
                right = true;
            if (ol == '1')
                left = true;
            if (or == '1')
                right = true;
        }
        else if (cl == '1')
        {
            if (il == '1')
                left = false;
            if (ir == '1')
                right = false;
            if (dl == '1')
                left = true;
            if (dr == '1')
                right = true;
            if (ol == '1')
                left = true;
            if (or == '1')
                right = true;
    }
    
        if (left == true)
            System.out.println("left door opens");
        if (right == true)
            System.out.println("right door opens");
        if ((right == false) && (left == false))
            System.out.println("Neither opens");
}
}
