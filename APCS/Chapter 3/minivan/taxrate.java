

/**
 * Peter Davis
 * Tax Rate Program
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class taxrate
{
    public static void main(String[] args){
        
        double income, tax = 0;
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("What is your income?");
        income = scan.nextDouble();
        
        if (income <= 50000)
            tax += income*.01;
        else if (income <= 75000)
            tax += (income - 50000)*.02 +500;
        else if (income <= 100000)
            tax += (income - 75000)*.03 +1000;
        else if (income <= 250000)
            tax += (income - 100000)*.04 +1750;
        else if (income <= 500000)
            tax += (income - 250000)*.05 +7750;
        else if (income > 500000)
            tax += (income - 500000)*.06 +20250;
         
        System.out.println("You will be taxed: "+money.format(tax));

    
    }

}
