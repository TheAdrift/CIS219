import javax.swing.JOptionPane;
public class Exercise2_1B
{
  public static void main(String[] args)
  {
    double fahrenheit = 0.0;
    // Enter a temperature in Fahrenheit
    System.out.print("Enter a temperature in Fahrenheit: ");
    fahrenheit = GetInput.readLineDouble();

    // Convert it to Celsius
    double celsius = (5.0 / 9.0) * (fahrenheit - 32);

    // Display the result
    System.out.println(fahrenheit + " Fahrenheit is " +
      celsius + " Celsius.");
    java.util.Date today = new java.util.Date();
    System.out.println("\nPROGRAM TERMINATED @ "+ today + " \n\n");
    JOptionPane.showMessageDialog(null,
      "PPROGRAM TERMINATED @ " + today +"\n",
      "EOJ - End of Job",
      JOptionPane.PLAIN_MESSAGE);

    System.exit(0);
  }//end of main method
}//end of class
