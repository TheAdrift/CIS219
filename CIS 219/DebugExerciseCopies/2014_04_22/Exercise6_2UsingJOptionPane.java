import javax.swing.JOptionPane;

public class Exercise6_2UsingJOptionPane 
{
  public static void main(String[] args) 
  {
    // Program to read 6 numbers from the user
    int [] number = new int[6];
    // Prompt the user to enter the first number
    String numberString = JOptionPane.showInputDialog(null,
      "Enter an integer");
    int max = Integer.parseInt(numberString);
    int count = 1;
    number[0] = max;
    String inputNumbers = max + " ";

    // Prompt the user to enter the remaining five numbers
    for (int i = 1; i <= 5; i++) 
    {
      numberString = JOptionPane.showInputDialog(null,
        "Enter an integer");
      int temp = Integer.parseInt(numberString);
      number[i] = temp;
      inputNumbers = temp + " ";

      if (number[x] > max) 
      {
        max = number[x];
        count = 1;
      }
      else 
        if (temp == max)
            count++;
    }//end of for loop

    JOptionPane.showMessageDialog(null,
      "The array is: " + inputNumbers + "\n" +
      "max is " + max + "\n" +
      "the occurrence count is " + count);
  }
}
