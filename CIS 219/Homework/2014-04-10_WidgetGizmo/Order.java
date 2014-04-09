/*
	Author:		Cameron Gayford
	Due Date:	2014-04-10
	Assignment:	Widgets and Gizmos--Loops, methods, summary reports.
	Course:		CIS-219
*/

public class Order
{
	final static double gizmoUnit = 0.75; //Price per unit gizmo, in $.
	final static double widgetUnit = 0.25;//Price per unit widget, in $.

	final static double gizmoLBS = 1/16;  //Gizmo unit weight, in lbs.
	final static double widgetLBS = 1/12; //Widget unit weight, in lbs.

	final static double rateFred = 25.0; //Fred's flat shipping rate, $.
	final static double rateUSPS = 1.25; //USPS shipping rate, $ per lb.

	public static double product_cost (int qty, String product)
	{
		double cost = 0.0;
		return cost;
	}//end method product_cost ( int, String )

	public static double shipping_cost (int qty, String product, String shipService)
	{
		double cost = 0.0;
		return cost;
	}//end method shipping_cost ( int, String, String )

}//end class Order