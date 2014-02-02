/********************************************************
 Please find the syntax AND logic errors in the this code
 ********************************************************/
import javax.swing.JOptionPane;

public class Comparison
{
  public static void main(String args[])
  {
    char choice = 'n';
    boolean results = false; //<--this boolean is never used.
    String result = "Foo";
    int number1, // first number to compare
        number2; // second number to compare

    do
    {
      System.out.print("Enter in one number (int)-->");
      //call a method in GetInput
      number1 = GetInput.readLineInt();

      System.out.print("Enter a second integer (int)-->");
      //call a method in GetInput
      number2 = GetInput.readLineInt();

      if (number1 == number2)
        result = number1 + " == " + number2;

      /*
      if (number1 != number2)//<--If this evaluated to true, none of the other statements will evaluate!
        result = number1 + " != " +  number2; //*/

      if (number1 < number2)
        result =  number1 + " < " + number2;

      if (number1 > number2)
        result =  number1 + " > " + number2;


      // Display results
      JOptionPane.showMessageDialog(null, result, "Comparison Results",
                                    JOptionPane.INFORMATION_MESSAGE);

      System.out.print("Do you wish to repeat this process? (Y/N)" );
      choice = GetInput.readLineNonwhiteChar();
      // call GetInput.  to read only one character of input data

    }while ((choice == 'Y') || (choice == 'y'));

    java.util.Date now = new java.util.Date();
    System.out.println("\n\nProgram terminated at " + now);
    System.out.println("END OF PROGRAM\n");

    System.exit(0);
  } //end of main method
} //end of class named Comparison
