//Created for a debug project January 2014
import javax.swing.JOptionPane;
public class WelcomeToJava
{
Public static void main(String [] args)
{
	java.util.Date now = new java.util.Date()

	JOptionPane.showMessageDialog(null,
	   "Welcome to Java!\nProgram terminated at: "+now,
	   "Display Message",
	   JOptionPane.PLAIN_MESSAGE);
	System.exit(0);
}//end of main method
}//end of class Welcom