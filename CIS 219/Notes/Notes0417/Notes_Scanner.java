import java.util.Scanner;
import java.io.*;

public class Notes_Scanner
{
	public static void main (String [] args)
	{
		String filename = new String();
		filename = "the_paragraph.txt";

		String [] line = new String[7];

		try
		{
			Scanner input = new Scanner(new File(filename));
			int i = 0;
			while (input.hasNext())
			{
				System.out.println("DEBUG: reading line "+i);
				String temporary = input.nextLine();//Retrieves the whole next line. "... input.next()" gets the next delimited token.
				line[i] = new String (temporary);//We really don't need all of this, can just call method on "temporary" but whatever. Notes.

				System.out.println(line[i]);
				i++;
			}//end while loop <---THIS SEEMS TO BE INFINITE

			System.out.println("Lines in file: "+ i);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Can't find input file.");
			System.out.println("Searching for filename: "+ filename);
			System.out.println("RUNTIME ERROR has occurred");
			System.out.println("Error: "+e);
		}
		catch (Exception ee)
		{
			System.out.println("RUNTIME ERROR has occurred");
			System.out.println("Error: "+ ee);
		}
	}//End main method
}//End class Notes_Scanner