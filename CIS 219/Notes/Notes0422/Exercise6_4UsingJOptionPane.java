// Exercise6_4.java: Analyze scores
import javax.swing.JOptionPane;
import java.text.*;

public class Exercise6_4UsingJOptionPane
{
  // Main method
  public static void main(String[] args)
  {
    double[] scores = new double[100];
    String[] names = new String[100];
    /*	^THESE are examples of parallel arrays. We will set up the code below so that
    	whenever an element is added to names[ i ], we will add an element to scores[ i ]
    */
    double sum = 0;
    int count = 0;
    double average = 0.0;
    String person = new String();
    person = JOptionPane.showInputDialog(null, "Enter a student name (stop = exit):  ");
    //primary read -- read before the loop
    while(!(person.equalsIgnoreCase("stop")))//<--pre-test loop
    {
      names[count] = new String(person);//<--put current person into names array

      String scoreString =
        JOptionPane.showInputDialog(null, "Enter a new score (0 = exit):  ");
      System.out.println("scoreString is:  "+scoreString);
      scores[count] = Double.parseDouble(scoreString);
        sum += scores[count];
        count = count + 1;

      person = JOptionPane.showInputDialog(null, "Enter a student name (stop = exit):  ");
    };//end while loop

    System.out.println("Sum of all grades: "+ sum);
    System.out.println("QTY of grades enteres: "+(count));

    if (count >0)
        average = sum  / count;

    int numOfAbove = 0;
    int numOfBelow = 0;
    for (int i = 0; i < count; i++)
      if (scores[i] >= average)
        numOfAbove++;
      else
        numOfBelow++;
    DecimalFormat mine =  new DecimalFormat("##0.00");
    System.out.println("Average is " + mine.format(average));
    System.out.println("Number of scores above or equal to the average "
      + numOfAbove);
    System.out.println("Number of scores below the average "
      + numOfBelow);
  }
}
