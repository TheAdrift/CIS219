import javax.swing.JOptionPane;

public class March18v2
{
	public static String menu()
	{
		String [] selectionValues = {"Car",
									"Truck",
									"SUV",
									"None of the above"};

		String option =	(String) JOptionPane.showInputDialog(null,
						"Select your type of vehicle", "Title",
						JOptionPane.QUESTION_MESSAGE,
						null,
						selectionValues,
						selectionValues[0]);
		return option;
	}//end menu()

	public static void purchaseCar()
	{
		JOptionPane.showMessageDialog(null, "Enjoy a Saturn VUE");
	}//end purchaseCar()

	public static void purchaseTruck()
	{
		JOptionPane.showMessageDialog(null, "Enjoy a Ford F250");
	}//end purchaseTruck()

	public static void main(String [] args)
	{
		String choice = menu();
		if (choice.equals("Car"))//a switch would work better here.
		//NB: looks like stringName.equals("value") is the equality operator for String.
			purchaseCar();
		else
			purchaseTruck();

		System.exit(0);
	}//end main method
}