//This program has both Syntax errors and Logic errors
//Can you fix both of the errors so the output looks "GOOD"
public class EasyProgram
{
	public static void main(String[] args)
	{

		String lineOne;
		String lineTwo;
		String lineThree = new String("");
		String lineFour;
		String lineFive;

		lineOne = ("\n\t  JJJJ     AAAAA     VV      VV     AAAAA    ");
		lineTwo = ("\t   JJ     AA   AA     VV    VV     AA   AA   ");
		String xyz = lineOne + "\n" + lineTwo; //<--Concatenate strings
		lineThree +=  lineTwo + ("\n\t   JJ     AAAAAAA      VV  VV      AAAAAAA   ");//<--concatenate and assign?
		lineFour = ("\tJJ JJ     AA   AA       VVVV       AA   AA   ");
		lineFive = ("\t JJJ      AA   AA        VV        AA   AA   ");

		System.out.println(xyz+"\n" + lineThree+"\n" + lineFour+"\n" + lineFive+"\n");
		System.out.println("\n\n\tTHE END OF THE PROGRAM\n");
	}//end of main method
}//end of class