public class String_Parse
{
	public static void main ( String [] args )
	{
		String sample = new String ( "The third race at the track was sensational.  Thirty thoroughbred horses raced like the "+
						"wind.  They plod through the mud with grace and, thankfully, with no threat to their "+
						"welfare.  This race made me think about the time and effort that trainer and the horses "/*+
						"spend together.  I thought about the strength of the breed.  There are times, I think, in "+
						"the lives of all people that an experience touches their minds.  Therefore, be observant, "+
						"thankful, and diligent.  Tithe your time and energy to become a success.  The last sentence "+
						"of this paragraph ends in the word the."*/);

		String test = new String ( "the" );

		//*DUMMY CODE
		System.out.println("\n\tMatches == "+ countString( test, sample ));
		System.out.println("\t Length == " + sample.length());
		//*/
	}//end main method

	public static int countString( String test , String sample )
	{
		int count = 0;
		for (int i = 0; i < sample.length(); i++)
		{
			//System.out.println(i + "\t" + sample.charAt(i));//DUMMY
			//count++;

			//check letter immediately preceding pointer
			if ((i == 0)||((sample.charAt(i - 1) == ' ')||(sample.charAt(i - 1) == '\n')))
			{
				System.out.println("Inside first IF\nCharacter: "+sample.charAt(i) + " Index: "+i);//DEBUG
				int success = 0;//tracks successful character matches each iteration of pointer i
				for (int p = 0; p < test.length(); p++)
				{
					//check pointer neighborhood against String test
					if (sample.charAt( i + p ) == test.charAt(p))
					{
						success++;
						//*
						System.out.println("\t\tInside 2nd IF. i == "+i+" p == "+p+"\n\t\t"+
											"sample.charAt(i + p)-> " + sample.charAt(i + p)+"\n\t\t"+
											"test.charAt(p)-------> " + test.charAt(p)+"\n\t\t"+
											"success == "+ success);//DEBUG	*/
					}

					switch (sample.charAt(i + test.length() + 1))
					{
						case ' ':
						case '.':
						case ',':
						case '?':
						case '!':
						case '\'':
						case '\"':
						case '\n':
						case '\t':
							success++;
							break;
						default:
							break;
					}

					if (success == test.length()+1)//exact match
					{
						count++;
						System.out.println("\t\tSuccess! Match at character "+i+". Count == " + count);
					}

					/* NOTE TO SELF:
					Additional logic needed to make certain string terminates on same character as test
					[So, check sample.charAt(i + p + 1) against '.', ',', '!', '?', ' ', '\n', '\t'...]
					*/

				}//end for loop that compares pointer neighborhood to String test
			}//end if statement
		}//end for loop that iterates pointer over String sample.

		return count;//int count only increments when an exact match is found.
	}//end countString ( String , String )
}//end class String_Parse