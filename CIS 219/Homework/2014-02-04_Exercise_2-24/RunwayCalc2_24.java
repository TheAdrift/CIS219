/*	Author:	Cameron Gayford
	email:	camgayford@gmail.com
	Course: CIS219
	Date: 2014-02-02			*/

import javax.swing.*;
import java.text.*;

public class RunwayCalc2_24
{
	//* Define function to calculate runway length
	public static double getRunway( double vel, double acc)
	{
		double runway = 0;
		vel = Math.abs(acc); //handle negative values
		runway = Math.pow(vel, 2) / (2 * acc);

		return runway;
	}	//*/

	public static void main (String [] args)
	{//Calculate minimum runway length from user input.
		/*
		String velString = new String ();
		String accString = new String ();
		// ^dummy strings for adding GUI input later.	*/

		DecimalFormat deci = new DecimalFormat("###,##0.00");

		boolean run = true; //controls execution loop.
		while (run == true)
		{
			System.out.println(
				"Please enter the aircraft velocity (m/s):\n");
			double velocity = GetInput.readLineDouble();

			System.out.println(
				"Please enter the aircraft acceleration (m/s^2):\n");
			double acceleration = GetInput.readLineDouble();

			double runwayLeng = getRunway(velocity, acceleration);

			System.out.println("\nThank you.\nThe minimum runway length" +
								" to accomodate this aircraft is:\n" +
								runwayLeng + " meters.");

			char go = 'n'; //loops if go == 'y' or 'Y'; exits otherwise.
			System.out.println(
				"Would you like to calculate another runway?\n"+"( y / n )");
			go = GetInput.readChar();
			if (go == 'y' || go == 'Y')
			{
				run = true;
			}
			else
			{
				run = false;
			}
		} //End while loop

		java.util.Date now = new java.util.Date();
		System.out.println("Thank you. End of Job.\nProgram terminated @ " +
							now);

	}//End main
}//End class
