/*
Write a program that reads the subtotal and gratuity rate and computes
the gratuity and total.  For example, if the user enters 10 for
subtotal and 15% for gratuity rate, the program displays $1.50 as gratuity
and $11.5 as total
*/

import java.text.*;
public class Financial
{
  public static void main(String[] args)
  {
    //Ask the user for subtotal
    //use GetInput to read subtotal from user
    System.out.println("Please enter the subtotal of your order: ");
    double subtotal = GetInput.readLineDouble();

    //Ask the user for gratuity
    //use GetInput to read gratuity
    System.out.println("Please enter the gratuity rate as a decimal:\n\t(Ex.: enter 10% as 0.10) ");
    double gratRate = GetInput.readLineDouble();

    //Compute gratuity
    double /*gratuity*/ total = subtotal*(1+gratRate);

	DecimalFormat money = new DecimalFormat("###,###,##0.00");

    //Add gratuity to subtotal	<--I did this in one step; see above.
    //Display total
    System.out.println("Your total after gratuity is:\n\t$" + money.format(total));
    System.out.println("\n\nEND OF PROGRAM\n");
  }//end of main
}//end of ErrorMessage class
