/*
	Author: Cameron Gayford
	Due:	2014-05-01
	Course:	CIS 219
*/
import java.util.*;
import java.io.*;
import java.text.*;

public class ModifiedAvg_v2
{
	public static void main (String [] args)
	{
		DecimalFormat degree = new DecimalFormat("0.00 degrees Fahrenheit");

		String temperatures = new String( "temperatures.txt" );
		double [] data = getDataFile(temperatures);
		double average = modAverage(data);

		System.out.println("For the following data in "+temperatures+":");
		for (int n = 0; n < data.length; n++)
			System.out.print(data[n] + " ");
		System.out.println("\n\tThe modified average temperature was: "+
			degree.format(average));
	}//end main method

	/**	double modAverage (double [] data)
	 * 	Returns the modified average of data[] by first removing
	 * 	the maximum and minimum values and averaging the remaining
	 * 	data set.
	 * 	If maximum or minimum are not unique values, exactly one (1)
	 * 	instance of each is removed before calculation.
	 * 	Returns double
	 **/
	public static double modAverage (double [] data)
	{
		double avg = 0.0;
		double sum = 0.0;
		//Find index of maximum and minimum values in data[]:
		int maxIndex = 0;
		int minIndex = 0;
		for (int k = 0; k < data.length; k++)
		{
			maxIndex = (data[k]>data[maxIndex])? k : maxIndex;
			minIndex = (data[k]<data[minIndex])? k : minIndex;
		}//end 1st for-loop
		//Sum over and average remaining data:
		for (int i = 0; i < data.length; i++)
		{
			sum = ((i == maxIndex)||(i == minIndex))? sum : sum + data[i];
		}//end 2nd for-loop

		avg = sum / (data.length - 2);
		return avg;
	}//End method modAverage ( double )

	/**	int countDoubles ( File data )
	 * 	Returns the number of doubles in passed File.
	 **/
	public static int countDoubles( File data ) throws Exception
	{
		Scanner readIn = new Scanner(data);
		int tokens = 0;
		//Count tokens that can be read with *.nextDouble()
		while (readIn.hasNextDouble())
		{
			double dummy = readIn.nextDouble();//advance the scanner
			tokens++;
		}//end while loop
		readIn.close();

		return tokens;
	}//End method countDoubles ( File )

	/**	double[] getDataFile ( String filename )
	 *	Creates, fills, and returns an array of doubles from the passed
	 *	file.
	 *	Will throw an exception if filepath is invalid.
	 **/
	public static double[] getDataFile ( String filename )
	{
		try
		{
			File data = new File(filename);
			double [] dataset = new double[countDoubles(data)];
			Scanner input = new Scanner(data);
			int k = 0;
			while (input.hasNextDouble())
			{
				dataset[k] = input.nextDouble();
				k++;
			}//End while-loop
			input.close();
			return dataset;
		}//End try-block
		catch (FileNotFoundException e)
		{
			System.out.println("FILE READ ERROR: File " + filename +
					" not found.\nError message follows: " + e);
		}//End "File Not Found" exception catch
		catch (Exception ee)
		{
			System.out.println("RUNTIME ERROR during file read.\n" +
					"Error message follows: " + ee);
		}//End general exception check
		double [] dummyData = new double[4];//To make the compiler happy.
		return dummyData;
	}//end method getDataFile ( String )
}//end class
