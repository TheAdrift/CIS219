import java.util.Scanner;
import java.io.*;

public class Notes_Substring_wSCANNER
{
	public static void main(String [] args)
	{
		int count = 0;
		String filename = new String("the_paragraph.txt");

		System.out.println("Check file "+filename+" for which string?");
		String test = new String (GetInput.readLine());//("the");

		try
		{
			Scanner input = new Scanner(new File(filename));
			int i = 0;
			while (input.hasNext())//Check file line-by-line for test string
			{
				//System.out.println("\tDEBUG: reading line "+i);
				String temporary = input.nextLine();//Retrieves the whole next line.

				int number = countVariations(temporary, test);//Check current line.
				count += number;

				System.out.println("\tOn line "+i+" there are "+number+" instances of \""+test+"\".");
				i++;
			}//end while loop

			System.out.println("\n\nThere are "+ count +" instances of \""+ test +"\" in the sample.\n");
			System.out.println("Lines in file: "+ i);
		}//END try block
		catch (FileNotFoundException e)
		{
			System.out.println("Can't find input file.");
			System.out.println("Searching for filename: "+ filename);
			System.out.println("RUNTIME ERROR has occurred");
			System.out.println("Error: "+e);
		}//END catch FileNotFoundException
		catch (Exception ee)
		{
			System.out.println("RUNTIME ERROR has occurred");
			System.out.println("Error: "+ ee);
		}//END catch Exception
	}//end main.

	/**	int countVariations( String sample, String test )
	*	Checks sample String for variations of test string.
	*	Checks with an array of pre- and post-pended characters,
	*	then checks the beginning and end of the sample string
	*	for the bare test. Ignores case.
	*	Returns int count of instances found.
	*/
	public static int countVariations(String sample, String test)
	{
		int count = 0;
		String [] prepend = {" ", "\'", "\"", "\t"};
		String [] punctuation = {" ", ",", ".", "!", "?", ":", ";", "]", ")", "}", "\'", "\"", "\n"};
		if (sample.length() >= test.length())
		{
			//Check all possible prepend variations:
			for (int pre = 0; pre < prepend.length; pre++)
			{	//With all possible punctuation/postpend variations:
				for (int post = 0; post < punctuation.length; post++)
				{
					//Construct variation "temp" on test string:
					String temp = new String(prepend[pre] + test + punctuation[post]);
					//Count the instances of "temp" in "sample":
					count += countSubstring(sample, temp);
				}//end punctuation for-loop
			}//end prepend for-loop

			//Check beginning of sample string for test string (plus punctuation variations):
			for (int post = 0; post < punctuation.length; post++)
			{
				//Construct variation "temp" on test string:
				String temp = new String(test + punctuation[post]);
				count += (((sample.substring(0, temp.length()).equalsIgnoreCase(temp))? 1 : 0));
			}//End punctuation for loop.

			//Check end of sample string for bare test string:
			count += (((sample.substring(sample.length()-test.length()).equalsIgnoreCase(test))? 1 : 0));
		}//End if statement

		return count;
	}//end method countVariations( String , String )

	/**	int countSubstring ( String sample, String test )
	*	Checks passed sample String for all exact instances of
	*	passed test String. Ignores case.
	*	Returns int count of instances found.
	*/
	public static int countSubstring( String sample, String test)
	{
		int count = 0;
		if (sample.length() >= test.length())
		{
			for (int b = 0; b < (sample.length() - test.length()); b++)
			{
				if (sample.substring( b, b + test.length() ).equalsIgnoreCase(test))
					count++;
			}//End for loop
		}//end if block
		return count;
	}//end method countSubstring( String, String )
}//End class
