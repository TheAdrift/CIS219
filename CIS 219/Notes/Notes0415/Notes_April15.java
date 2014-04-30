public class Notes_April15
{
	public static void main(String [] args)
	{
		String line = new String("welfare.  This race made me think about the time and effort that trainer and the horses");

		String [] sampleText = {
			"The third race at the track was sensational.  Thirty thoroughbred horses raced like the",
			"wind.  They plod through the mud with grace and, thankfully, with no threat to their",
			"welfare.  This race made me think about the time and effort that trainer and the horses",
			"spend together.  I thought about the strength of the breed.  There are times, I think, in",
			"the lives of all people that an experience touches their minds.  Therefore, be observant,",
			"thankful, and diligent.  Tithe your time and energy to become a success.  The last sentence",
			"of this paragraph ends in the word the.",
			};
		String test = new String("the");
		//String test2 = new String(" the ");

		int number = 0;
		for (int i = 0; i < sampleText.length; i++)
		{	//Check each line of the sample text for the test string:
			number += countVariations(sampleText[i], test);
		}//end for-loop

		System.out.println("There are "+ number +" instances of \""+ test +"\" in the sample.");
		//System.out.println("There are "+ number2 +" variations on \""+ test2 +"\" in the sample.");
	}//end main.

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
				count += (((sample.substring(0, temp.length()).equalsIgnoreCase(test))? 1 : 0));
			}//End punctuation for loop.

			//Check end of sample string for bare test string:
			count += (((sample.substring(sample.length()-test.length()).equalsIgnoreCase(test))? 1 : 0));
		}//End if statement

		return count;
	}//end method countVariations( String , String )

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