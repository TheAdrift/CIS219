import javax.swing.JOptionPane;
import java.text.*;

public class Volume
{
  public static void main(String[] args)
  {
    // Enter radius of the cylinder  AS A STRING
    // use JOptionPane.showInputDialog   aks user for "Enter radius of the cylinder: "
    String radiusString = new String(); //Doing it this way reserves memory for this variable.
    //Direct assignment, i.e.--> String radiusString = JOptionPane... does evaluate
    radiusString = JOptionPane.showInputDialog(
		null,
		"Please enter the radius of a cylinder: ",
		"Radius", JOptionPane.QUESTION_MESSAGE);

	/* Catch exception if user does not enter numerals.
	try ()
	//*/

    // Parse the String the user enters into a double
    double radius = Double.parseDouble(radiusString);
    // http://stackoverflow.com/questions/17386038/does-joptionpane-showinputdialog-return-a-different-string

    // Enter length of the cylinder AS A STRING
    // use JOptionPane.showInputDialog aks user "Enter length of the cylinder: "
	String lengString = new String();
	lengString = JOptionPane.showInputDialog(
		null,
		"Please enter the length of this cylinder: ",
		"Length", JOptionPane.QUESTION_MESSAGE);
    double length = Double.parseDouble(lengString);

	double volume = Math.pow(radius, 2)* Math.PI * length;

    // Could this program use Math.pow(radius,2)
    // if so can you plug that in where it belongs<--DONE

    DecimalFormat show = new DecimalFormat("###,###,##0.00");
    System.out.println("The volume of the cylinder is " + volume);
    //*Alternatively: use JOptionPane to display answer

    JOptionPane.showMessageDialog(
		null,
		"The volume of the cylinder is \n\t" + show.format(volume),
		"Volume", JOptionPane.INFORMATION_MESSAGE);
    //*/
	System.exit(0);
    //I will help you include try{} catch{} blocks
  }
}
