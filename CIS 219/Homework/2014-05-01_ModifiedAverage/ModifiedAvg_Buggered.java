/*
	Author: Cameron Gayford
	Due:	2014-05-01
	Course:	CIS 219
*/
import java.util.*;
import java.io.*;

public class ModifiedAvg_Buggered
{
	public static void main (String [] args)
	{
		String filename = new String( "temperatures.txt" );
		//double [] data = getDataFile(temperatures);
		//double average = modAverage(data);


		/*Something is wrong. Trying the parts individually.

		System.out.println("For the following data in "+temperatures+":");
		for (int n = 0; n < data.length; n++)
			System.out.print(data[n] + " ");
		System.out.println("\n\tThe modified average temperature was: "+
			average); //*/

		try
		{
			File data = new File(filename);
			Scanner input = new Scanner(data);
			int tokens = 0;
			Scanner input2 = new Scanner(data);
				while (input.hasNextDouble())
				{
					double dummy = input.nextDouble();
					System.out.println("DEBUGGING: count on token #"
							+ tokens + "has found value " + dummy);
					tokens++;
				}//end while loop
			input2.close();
			double [] dataset = new double[tokens];
			int k = 0;
			while (input.hasNextDouble())
			{
				dataset[k] = input.nextDouble();
				System.out.println(k + " <-- " + dataset[k]);
				k++;
			}//End while-loop
			input.close();

			double average = modAverage(dataset);
			System.out.println("For the following data in "+filename+":");
			for (int n = 0; n < dataset.length; n++)
				System.out.print(dataset[n] + " ");
			System.out.println("\n\tThe modified average temperature was: "+
						average); //*/


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
			System.out.println("["+i+"]" + data[i]);
		}//end 2nd for-loop

		avg = sum / (data.length - 2);
		return avg;
	}//End method modAverage ( double )

	/**	int countDoubles ( File data )
	 * 	Returns the number of doubles in passed File.
	 **/
	/*
	public static int countDoubles( File data )
	{
		int tokens = 0;
		//Count tokens that can be read with *.nextDouble()
		try
		{
			Scanner input = new Scanner(data);
			while (input.hasNextDouble())
			{
				double dummy = input.nextDouble();
				System.out.println("DEBUGGING: countDoubles on token "
						+ tokens + "has found value " + dummy);
				tokens++;
			}//end while loop
			input.close();
		}//end try block
		catch (FileNotFoundException e)
		{
			System.out.println("FILE READ ERROR: File not found."+
					" not found.\nError message follows: " + e);
		}//End "File Not Found" exception catch
		catch (Exception ee)
		{
			System.out.println("RUNTIME ERROR during file read.\n" +
					"Error message follows: " + ee);
		}//End general exception check

		System.out.println("# of tokens found in data: "+tokens);

		return tokens;
	}//End method countDoubles ( File ) */

	/**	double[] getDataFile ( String filename )
	 *	Creates, fills, and returns an array of doubles from the passed
	 *	file.
	 *	Will throw an exception if filepath is invalid.
	 **/
	/*
	public static double[] getDataFile ( String filename )
	{
		//double [] dataset = new double[4];//declaring outside try-block in case of failure
		try
		{
			File data = new File(filename);
			Scanner input = new Scanner(data);
			double [] dataset = new double[countDoubles(data)];
			int k = 0;
			while (input.hasNextDouble())
			{
				dataset[k] = input.nextDouble();
				System.out.println(k + " <-- " + dataset[k]);
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
		//return dataset;//so that the compiler returns *something*.
	}//end method getDataFile ( String ) */
}//end class
