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

	final static double gizmoLBS = 1.0/16;  //Gizmo unit weight, in lbs.
	final static double widgetLBS = 1.0/12; //Widget unit weight, in lbs.

	final static double rateFred = 25.0; //Fred's flat shipping rate, $.
	final static double rateUSPS = 1.25; //USPS shipping rate, $ per lb.

	static String [] productLines = {"Gizmos", "Widgets"};
	static String [] shipOptions = {"FredEx", "USPS"};


	/**product_cost ( int qty, String prod )
	*	Determines the cost of [qty] products of type [prod].
	*	Returns a double.
	*/
	public static double product_cost (int qty, String prod)
	{
		double cost = 0.0;

		cost = ((prod.equals(productLines[0]))? qty*gizmoUnit : qty*widgetUnit);

		return cost;
	}//end method product_cost ( int, String )

	/**shipping_cost ( int qty, String prod, String ship )
	*	Determines the cost of shipping [qty] products of type [prod] using
	*	shipping service [ship].
	*	Returns a double.
	*/
	public static double shipping_cost (int qty, String prod, String ship)
	{
		double cost = 0.0;
		double weight = 0.0;

		weight = ((prod.equals(productLines[0]))? qty*gizmoLBS : qty*widgetLBS);
		/*
		System.out.println(prod.equals(productLines[0])+
						"\n\tGizmo weight per unit: " + gizmoLBS
						+"\n\tWidget weight per unit: " + widgetLBS);
		System.out.println("order weight: " + weight);//DEBUG CODE*/

		cost = (ship.equals(shipOptions[0]))? rateFred : Math.ceil(weight)*rateUSPS;

		return cost;
	}//end method shipping_cost ( int, String, String )

}//end class Order