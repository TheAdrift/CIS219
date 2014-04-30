import javax.swing.JOptionPane;
import java.text.*;
public class ParallelArrays
{
  // Main method
  public static void main(String[] args)
  {
    double [] scores = new double[100];
    String [] names  = new String[100];
    double sum = 0;
    int count = 0;
    double average = 0.0;
    String person = new String();
    person = JOptionPane.showInputDialog(null, "Enter in student name (stop = exit)  ");
    //primer Read - read before enter the loop
    while (!(person.equalsIgnoreCase("stop")))
    {
	  names[count] = new String(person);
      String scoreString =
        JOptionPane.showInputDialog(null, "Enter a new score");
      scores[count] = Double.parseDouble(scoreString);
      sum = sum + scores[count];
      count = count + 1;
      person = JOptionPane.showInputDialog(null, "Enter in NEXT student name (stop = exit)  ");
    }
    System.out.println("Total of all test grades:  "+sum);
    System.out.println("QTY of grades entered:  "+count);
    if (count >0)
        average = sum  / count;

    int numOfAbove = 0;
    int numOfBelow = 0;
    for (int i = 0; i < count; i++)
      if (scores[i] >= average)
        numOfAbove++;
      else
        numOfBelow++;
    DecimalFormat mine = new DecimalFormat("##0.00");
    System.out.println("Average is " + mine.format(average));
    System.out.println("Number of scores above or equal to the average "
      + numOfAbove);
    System.out.println("Number of scores below the average "
      + numOfBelow);
  }
}