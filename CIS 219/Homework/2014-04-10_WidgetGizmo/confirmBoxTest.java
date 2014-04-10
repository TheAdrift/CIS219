import javax.swing.*;

public class confirmBoxTest
{
	public static void main (String [] args)
	{
		String x = "Here is a string!";

		System.out.println(
			JOptionPane.showConfirmDialog(null,
				"Confirm?\n\n"+x, "Confirm", JOptionPane.YES_NO_OPTION)
			);//NOTE: YES is 0, NO is 1.
		System.exit(0);
	}
}