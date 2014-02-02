
import javax.swing.JOptionPane;
public class Debug2
{
    public static void main(String [] args)
    {
    //Look for Logic errors AND Syntax errors!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    double f = 18.5;
    double c = 0.0;    //used to store the calculated Celsius temperature

    c = ( 5.0 / 9.0 ) * (f - 32.0);

    System.out.println("F = " + f + "\tC = " + c);
    System.out.println("F stands for Fahrenheit, C stands for Celsius/n");
    java.util.Date now = new java.util.Date();
    JOptionPane.showMessageDialog (null,
        "End of sample program named \"Debug2.java\"\nTerminated at ->"+now,
        "EOJ",
        JOptionPane.PLAIN_MESSAGE);
    System.exit(0);
    }
}//end of class Debug2