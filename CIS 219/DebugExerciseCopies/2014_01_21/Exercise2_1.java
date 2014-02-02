import javax.swing.JOptionPane;
public class Exercise2_1 
{
  public static void main(String[] args) 
  {
    double celsius = 0.0;
    // Enter a temperature in Fahrenheit
    System.out.print("Enter a temperature in Celsius: ");
    celsius = GetInput.readLineDouble();

    // Convert it to Celsius
    double fahrenheit = (9.0 / 5) * celsius + 32;

    // Display the result
    System.out.println(celsius  " Celsius is " +
      fahrenheit + " Fahrenheit");
    java.util.Date today = new java.util.Date();
    System.out.println("\nPROGRAM TERMINATED @ "+ TODAY + " \n\n");
    JOptionPane.showMessageDialog(null,
      "PPROGRAM TERMINATED @ " + today +"\n",
      "EOJ - End of Job",
      JOptionPane.PLAIN_MESSAGE);
      
    System.exit(0);
  }//end of main method
}//end of class
