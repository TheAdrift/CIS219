/*
	Author:	Cameron Gayford
	Date:	2014-01-23
	Course:	CIS 219
	email:	camgayford@gmail.com
*/

public class CompExpr1_5
{

	public static void main(String [] args)
	{
		//Compute the expression ((9.5*4.5)-(2.5*3))/(45.5-3.5)
		double answer = ((9.5*4.5)-(2.5*3))/(45.5-3.5); //Compute
		System.out.println("The expression" + "\n"
						+ "\t" + "9.5*4.5 - 2.5*3" + "\n"
						+ "\t" + "---------------" + "\n"
						+ "\t" + "  45.5 - 3.5" + "\n");//Display expression.
		System.out.println("\nYields:" + "\n\t" + answer + "\n");
		//Display answer.

		java.util.Date now = new java.util.Date();
		System.out.println("End of Job\nPROGRAM TERMINATED @ " + now + "\n");
	}//End main.

}//End class.