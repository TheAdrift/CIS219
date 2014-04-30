// Exercise6_4.java: Analyze scores
import javax.swing.JOptionPane;
import java.text.*;

public class Exercise6_4UsingJOptionPane
{
  // Main method
  public static void main(String[] args)
  {
    double[] scores = new double[100];
    double sum = 0;
    int count = 0;
    double average = 0.0;
    double temporary = 0;
    int x = 1;

    do {
      String scoreString =
        JOptionPane.showInputDialog(null, "Enter a new score (0 = exit):  ");
      System.out.println("scoreString is:  "+scoreString);
      temporary = Double.parseDouble(scoreString);
      if (temporary != 0)
        {
        scores[count] = temporary;
        sum = sum + scores[count];
        count = count + 1;
        }

    } while (temporary != 0);
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
