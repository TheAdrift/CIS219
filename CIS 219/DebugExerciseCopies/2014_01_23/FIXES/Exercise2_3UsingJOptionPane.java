import javax.swing.*;

public class Exercise2_3UsingJOptionPane
{
  public static void main(String[] args)
  {
    // Enter foot
    String footString = JOptionPane.showInputDialog(null,
      "Enter feet as an integer:",
      "Exercise 2_3 Input", JOptionPane.QUESTION_MESSAGE);

    // Convert string to int
    int foot = 0;

    try
    {
    	foot =  Integer.parseInt(footString);
    	//parseInt(stringData) tries to convert stringData to an int
    	/*NB: parseInt() WILL FAIL if passed a string which contains
    	anything other than a number. We need a try/catch block.*/
	}
	catch (NumberFormatException x)
	{
		System.out.println("ERROR has occured when attempting to " +
							"convert a string to a number.");
		System.out.println("This error was caused by the line " +
							"Integer.parseInt(footString)");
		System.out.println("ACTUAL ERROR MESSAGE WAS: ");
		System.out.println(x);
	}
	catch (Exception error)
	{
		System.out.println("Unknown runtime ERROR has occured.");
		System.out.println("This error will result in \"foot\" " +
							"having no value.");
		System.out.println("The exception error message is provided below:");
		System.out.println(error);
	}


    double meter = foot * 0.305;

    //System.out.println("It is " + meter + " meters");
    //Just for my own edification, use JOptionPane to display answer:
    JOptionPane.showMessageDialog(null,
    	foot + " feet is " + meter + " meters.",
    	"Exercise 2_3 Output",
    	JOptionPane.PLAIN_MESSAGE);
    System.exit(0);
  }//end of main method
}//end of class
