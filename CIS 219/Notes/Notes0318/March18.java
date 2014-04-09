import javax.swing.JOptionPane;

public class March18
{
	public static int menu()
	{
		int option = 0;
		boolean valid = false;
		while (valid == false)
		{
			try
			{
				String temporary = new String();
				temporary = JOptionPane.showInputDialog("Enter 1 - to purchase car"
											+ "\nEnter 2 - to purchase truck");
				option = Integer.parseInt(temporary);
				valid = true;

				if ((option == 1)||(option == 2))
					valid = true;
				else
					valid = false;
			}//end try
			catch (NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "Error-> " + error);
				JOptionPane.showMessageDialog(null, "Error in input value\n"
											+ "Enter only 1 or 2.");
			}//end catch
		}//end while loop

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
		int choice = menu();
		if (choice == 1)
			purchaseCar();
		else
			purchaseTruck();

		System.exit(0);
	}//end main method
}