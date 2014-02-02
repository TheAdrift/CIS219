import javax.swing.JOptionPane;

public class Exercise2_1WithDialogBox
{
  public static void main(String[] args)
   {
    // Enter a temperature in Fahrenheit
    String celsiusString = JOptionPane.showInputDialog(null,
      "Enter a temperature in Celsius:",
      "Exercise2_1 Input", JOptionPane.QUESTION_MESSAGE);

    // Convert string to double
    double celsius =  Double.parseDouble(celsiusString);

    // Convert it to Celsius
    double fahrenheit = (9.0 / 5) * celsius + 32;

    // Display the result
    JOptionPane.showMessageDialog(null, "The temperature is " +
      fahrenheit + " in Fahrenheit");
    java.util.Date today = new java.util.Date();
    System.out.println("\nPROGRAM TERMINATED @ " + today);
    System.exit(0);
  }//end of main
}//end of class
