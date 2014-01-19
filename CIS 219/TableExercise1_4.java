/*	Author:	Cameron Gayford
	Date:	2014-01-16
	Course:	CIS 219
	email:	camgayford@gmail.com	*/

public class TableExercise1_4
{//We want to display a table with given elements, of 3 cells by 4 cells.
	public static void main (String [] args)
	{
		//System.out.println("\na\ta^2\ta^3" + "\n1\t1\t1" + "\n2\t4\t8" + "\n3\t9\t27" + "\n4\t16\t64" + "\n");
		//I would rather have this calculate from vars on the fly than be put in by hand. Let's try calculation w/out vars for now.
		/* Furthermore, this should be a function that I can call arbitrary times. In lieu of knowing how to struct a function:
		System.out.println("\n" + "a\t" + "a^2\t" + "a^3");
		int a;
		a = 1;
		System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a));
		a ++;
		System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a));
		a ++;
		System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a));
		a ++;
		System.out.println(a + "\t" + (a*a) + "\t" + (a*a*a));
		// Math.pow(base, exponent) is the exponent function. */

		/* Now, more simply again. I'd like eventually to write this as a function:
		System.out.println("a" + "\t" + "a^2" + "\t" + "a^3" + "\n");
		int a = 1;
		int aSqr = Math.pow(a, 2); //<--which would loop back to this line
		int aCub = Math.pow(a, 3);
		System.out.println( a + "\t" + aSqr + "\t" + aCub + "\n"); //<--from this line, and iterate n times where n is user input.
		a ++;
		aSqr = Math.pow(a, 2);
		aCub = Math.pow(a, 3);
		System.out.println( a + "\t" + aSqr + "\t" + aCub + "\n");
		//*/
	}
}