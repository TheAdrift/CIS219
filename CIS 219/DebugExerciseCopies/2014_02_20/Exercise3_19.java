//Exercise3_19.Java
//Logic Error, does not display YES! or NO if it is a valid triangle
//Fix the logic error
import javax.swing.JOptionPane;
public class Exercise3_19
{
    public static void compute(double x, double y double z)
    {
      if (((x + y) > z) && ((z + y) > x) &&  ((z + x) > y))
		System.out.println("Yes! those sides can make up a triangle.");
	  else
		System.out.println("No, it's NOT possible for those sides to make a triangle."); 
    }//end of void method to compute if we have valid triangle sides

	public static void main (String[] args)
	{
	double side_x = 0.0;
	double side_y = 0.0;
	double side_z = 0.0;

	System.out.print("Enter side x of the triangle ");
    side_x = GetInput.readLineDouble();
	System.out.print("Enter side y of the triangle ");
	side_y = GetInput.readLineDouble();
	System.out.print("Enter side z of the triangle " );
	side_z = GetInput.readLineDouble();

    java.util.Date now = new java.util.Date();
    JOptionPane.showMessageDialog(null, "END OF PROGRAM\nCompleted at "+now, "EOJ",
                               JOptionPane.INFORMATION_MESSAGE);
     System.out.println("\nEOJ\n");
     System.exit(0);
	} 
}

