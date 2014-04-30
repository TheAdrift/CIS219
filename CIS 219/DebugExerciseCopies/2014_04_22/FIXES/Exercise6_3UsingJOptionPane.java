// Exercise6_3.java: Enter 10 integers and
// display the numbers in reverse order
import javax.swing.JOptionPane;
import java.util.Date;
public class Exercise6_3UsingJOptionPane
{
  public static void main (String[] args)
  {
    int[] num = new int[10];

    for (int i = 0; i < num.length ; i++)
    {
      // Read a number
      String dataString = JOptionPane.showInputDialog(null,
        "Read a number:",
        "Exercise6_3", JOptionPane.QUESTION_MESSAGE);

      num[i] = Integer.parseInt(dataString);
    }//end of for loop

    displayArrayReverseOrder( num );

    Date now = new Date();
    System.out.println("\nEOJ\tTerminated at ->"+now);
    }//end of main /**


    public static void displayArrayReverseOrder(int num[])
    {
    // Display the array
    for (int i = (num.length - 1) ; i >= 0; i--)
    {
      System.out.println(num[i]);
    }//end of for loop
  }//end of method displayArrayReverseOrder
}//end of class

