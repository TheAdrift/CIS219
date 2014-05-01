import java.util.*;
import java.io.*;

public class ScannerTesting
{
	public static void main (String [] args) throws Exception
	{
		File thing = new File("temperatures.txt");
		Scanner input = new Scanner(thing);
		System.out.println("hasNext() --> " + input.hasNext());
		System.out.println("hasNextInt() -->" + input.hasNextInt());
		int nextInteger = input.nextInt();
		System.out.println("nextInt() == "+ nextInteger);
		System.out.println("hasNextDouble() -->" + input.hasNextDouble());
		System.out.println("nextDouble() -->" + input.nextDouble());
	}//End main
}//End class