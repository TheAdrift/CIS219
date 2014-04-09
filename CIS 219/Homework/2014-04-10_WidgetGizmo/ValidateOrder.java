/*
	Author: 	Cameron Gayford
	Date Due: 	2014-04-10
	Assignment:	Widgets and Gizmos--Loops, methods, summary reports.
	Course:		CIS-219
*/

import javax.swing.*;

public class ValidateOrder
{
	final static int GIZMO_PACK = 8; //Gizmos ship in multiples of 8.
	final static int WIDGET_PACK = 12; //Widgets ship in dozens.

	static String [] productLines = {"Gizmos", "Widgets"};
	static String [] shipOptions = {"FredEx", "USPS"};

	//Accumulators.
	double totalQtyGizmos, totalQtyWidgets, gross_revenue;

	public static String getProduct()
	{
		String selection = (String) JOptionPane.showInputDialog(null,
				"Select product:", "TITLE", JOptionPane.QUESTION_MESSAGE,
				null, productLines, productLines[0]);
		return selection;
	}//end method String getProduct()

	public static String getShipping()
	{
		String selection = (String) JOptionPane.showInputDialog(null,
						"Select shipping method:", "TITLE", JOptionPane.QUESTION_MESSAGE,
						null, shipOptions, shipOptions[0]);
		return selection;
	}//end method String getShipping()

	public static int validateQty(String p)
	{
		int qty = 0;
		int group_size = 1;
		boolean valid = false;

		if (p.equals(productLines[0]))
			group_size = GIZMO_PACK;
		else
			group_size = WIDGET_PACK;

		//System.out.println("group_size == " + group_size);//DEBUG CODE
		do
		{
			String qtyTXT = JOptionPane.showInputDialog(
						"How many " + p + " would you like to order?\n"
						+ "[" + p + " must be ordered in whole packs of "
						+ group_size + ".]");
			try
			{
				qty = Integer.parseInt(qtyTXT);
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,
					"ERROR in input data.\nOrders must be whole integer values.",
					"ERROR", JOptionPane.ERROR_MESSAGE);
			}
			catch (Exception ee)
			{
				JOptionPane.showMessageDialog(null,
					"ERROR: The following run-time exception has occurred:\n"+ee,
					"ERROR", JOptionPane.ERROR_MESSAGE);
			}

			if (qty % group_size != 0)
				valid = false;
			else
				valid = true;
			/*DEBUG CODE
			System.out.println("qty == " + qty);
			System.out.println("qty % group_size == " + qty % group_size);//*/
		} while (valid == false);
		return qty;
	}//end method int validateQty ( String )

	public static void main (String [] args)
	{
		/*
		int x = 15;
		int y = 8;
		int z = 12;
		int a = x % y;
		int b = x % z;
		System.out.println(x + " % " + y + " == " + a );
		System.out.println(x + " % " + z + " == " + b );

		int qtyG = validateQty ("Gizmos");
		int qtyW = validateQty ("Widgets");
		System.out.println("Gizmos --> " + qtyG + "\nWidgets --> " + qtyW);
		//DEBUGGING CODE */

		String prod = getProduct();
		System.out.println(prod);
		int quantity = validateQty(prod);
		System.out.println(quantity);
		String ship = getShipping();
		System.out.println(ship);
		System.exit(0);

	}//end main method

}//end class ValidateOrder