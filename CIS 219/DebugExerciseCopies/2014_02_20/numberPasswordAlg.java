/*
* Made by Jacob Smith
* CIS219 Debug
* This programs is to get an input between 1 and 6 digets long.
* After recieving input, a loop is to find the number entered.
* This could be used to find a number password or search an array
*/
public class NumberPasswordAlg
{
	public static void main ( String args []);
	{
		boolean correct;
		System.out.println("Enter a number between 1 and 6 digets long for a password, then hit enter.");
		int p = Getinput.readLineInt();

		while( correct ! true)
		{
			a++;
			System.out.println(a);

			if(a=p)
			 {
			  correct= false;
			  System.out.println("The number you entered was-> "p);
			 }
		}//end while
		System.exit(0);
	}//end of main
}//end of class