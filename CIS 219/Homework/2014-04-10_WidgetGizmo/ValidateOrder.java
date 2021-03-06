/*
	Author: 	Cameron Gayford
	Date Due: 	2014-04-10
	Assignment:	Widgets and Gizmos--Loops, methods, summary reports.
	Course:		CIS-219
*/

import javax.swing.*;
import java.text.*;

public class ValidateOrder
{
	final static int GIZMO_PACK = 8; //Gizmos ship in multiples of 8.
	final static int WIDGET_PACK = 12; //Widgets ship in dozens.
	final static int WIDGET_LIMIT = 144;//No more than 144 Widgets/order.

	static String STORE = "Welcome to Wally's Widgets";

	static String [] prodLines = {"Gizmos", "Widgets"};
	static String [] shipOptions = {"FredEx", "USPS"};
	static String [] go = {"No", "Yes"};

	static DecimalFormat money = new DecimalFormat("$ "+"#,###,##0.00");

	public static void main (String [] args)
	{
		//Accumulator variables.
		int total_Giz = 0; int total_Wid = 0; int count = 0;
		double gross_ship = 0.0; double gross_revenue = 0.0;

		//Ask user to begin order loop.
		boolean run = false;
		run = startChoice(count);
		String name = ((run == true)? getName() : "" );

		do
		{
			if (run == true)//Skips the block if customer selects NO.
			{
				String prod = getProduct();
				int qty = validateQty(prod);
				String ship = getShipping();

				double price = Order.product_cost(qty, prod);
				double shipCost = Order.shipping_cost(qty, prod, ship);
				double subtotal = price + shipCost;

				String report =
					"Customer: "+ name +"\n"+
					"Ordered "+qty+" "+prod+" costing \t"+money.format(price)+"\n"+
					"Shipped via "+ship+" costing \t"+money.format(shipCost)+"\n"+
					"Total order cost is \t\t"+money.format(subtotal);

				if (confirm(report) == true)//Confirm the order is correct.
				{
					count++;
					gross_ship += shipCost;
					gross_revenue += subtotal;
					total_Giz += ((prod.equals(prodLines[0]))? qty: 0);//add Gizmos
					total_Wid += ((prod.equals(prodLines[1]))? qty: 0);//add Widgets
					System.out.println("\nOrder No.: "+ count +"\n__________\n"
										+ report +"\n\n");
				}

				run = startChoice(count);//Check if customer wants another order.
			}
		}while (run == true);//End detail order do - while loop

		String summary = "\n\tCustomer: "+ name +"\n"+
						"\t_________\n"+
						count + " orders placed.\n"+
						"Total Gizmos:\t"+total_Giz+"\n"+
						"Total Widgets:\t"+total_Wid+"\n"+
						"Shipping & Handling: "+money.format(gross_ship)+
						"\n====================\n"+
						"GRAND TOTAL: \t"+money.format(gross_revenue)+"\n";

		String exitMessage = new String();
		if (count != 0)
			exitMessage = "Thank you for your business.\n" +
							"Your order summary is:\n"+ summary;
		else
			exitMessage = "Thank you for your business.";

		JOptionPane.showMessageDialog(null, exitMessage, STORE,
										JOptionPane.PLAIN_MESSAGE);
		System.out.println(exitMessage);
		System.exit(0);

	}//end main method

	/**startChoice ( int count )
	*	This method displays a confirmation dialog to prompt the user
	*	if they wish to place an order.
	*	Returns boolean: true if "Yes", false if "No."
	*/
	public static boolean startChoice(int count)
	{
		String an = ((count==0)? "an" : "another");

		int choice = JOptionPane.showConfirmDialog(null,
				"Would you like to place "+an+" order?", STORE,
				JOptionPane.YES_NO_OPTION);

		return ((choice == 0)? true : false);

	}//end method startChoice ( int )

	/**confirm ( String x )
	*	Displays a confirmation dialog with the passed String.
	*	Returns boolean: true if "Yes", false if "No."
	*/
	public static boolean confirm (String x)
	{
		int choice = JOptionPane.showConfirmDialog(null,
						"Place this order?\n\n"+x, "CONFIRM ORDER",
						JOptionPane.YES_NO_OPTION);

		return ((choice == 0)? true : false);

	}//end method confirm ( String )

	/**getName ()
	*	Displays an input box and prompts the user for a string.
	*	Returns that string.
	*/
	public static String getName()
	{
		return ( JOptionPane.showInputDialog(
				"Please enter your name:")	);

	}//end method getName()

	/**getProduct()
	*	Displays a dialog box and prompts the user to choose either
	*	"Gizmo" or "Widget".
	*	Returns string value of that choice.
	*/
	public static String getProduct()
	{
		String selection = (String) JOptionPane.showInputDialog(null,
				"Select product:", STORE, JOptionPane.QUESTION_MESSAGE,
				null, prodLines, prodLines[0]);
		return selection;
	}//end method getProduct()

	/**getShipping ()
	*	Displays a dialog box and prompts the user to choose either
	*	"FredEx" or "USPS".
	*	Returns the string value of that choice.
	*/
	public static String getShipping()
	{
		String selection = (String) JOptionPane.showInputDialog(null,
				"Select shipping method:", STORE,
				JOptionPane.QUESTION_MESSAGE,
				null, shipOptions, shipOptions[0]);
		return selection;
	}//end method getShipping()

	/**validateQty ( String p )
	*	Displays a set of dialog boxes to prompt user for and validate
	*	a quantity of product p [either "Gizmos" or "Widgets"].
	*	Validation includes checking integer batch sizes for each category,
	*	error detection, and an upper bound for Widgets.
	*	Returns a valid integer quantity.
	*/
	public static int validateQty(String p)
	{
		int qty = 0;
		int group_size = 1;
		boolean valid = false;

		if (p.equals(prodLines[0]))
			group_size = GIZMO_PACK;
		else
			group_size = WIDGET_PACK;

		String groupErr = p+" must be ordered in packs of "+group_size;

		do
		{
			String qtyTXT = JOptionPane.showInputDialog(null,
						"How many " + p + " would you like to order?\n"
						+ "[" + groupErr + ".]",
						STORE, JOptionPane.QUESTION_MESSAGE);
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
					"ERROR: The following run-time exception has occurred:\n"
					+ee, "ERROR", JOptionPane.ERROR_MESSAGE);
			}

			if ((qty % group_size != 0) || (qty < 0))
			{
				System.out.println(groupErr);
				valid = false;
			}
			else if ((p.equals(prodLines[1])) && (qty > WIDGET_LIMIT))
			{
				//Check upper widget limit
				String overLim = "More than "+ WIDGET_LIMIT +
					" widgets cannot ship in one order.\n\n"+
					"We apologise for the inconvenience.";
				System.out.println(overLim);
				JOptionPane.showMessageDialog(null, overLim, "Sorry!",
					JOptionPane.WARNING_MESSAGE);
				valid = false;
			}
			else
				valid = true;
		} while (valid == false);

		return qty;
	}//end method validateQty ( String )
}//end class ValidateOrder
