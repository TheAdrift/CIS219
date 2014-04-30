/*

NOTES 2014-04-22

Topic:	Parallel Array

*/

public class Notes_04_22
{
	/*
	"Corresponding data":
		element [x] of one array is "connected" or "linked" to
		element [x] of another array.

		This is basically an ordered pair.
		so, a list of points like:
			1(0, 0)
			2(7, 3)
			3(8, 1)

		could be represented as two arrays x[] and y[]:
			x[1] = 0;
			x[2] = 7;
			x[3] = 8;

			y[1] = 0;
			y[2] = 3;
			y[3] = 1;

			**remember that Strings store a relative address:
			String user = "Bob"; 	<--in memory A23FF
			String name = "Bob"; 	<--in memory F08EA
			user == name; 			<--FALSE: A23FF != F08EA
			user.equals(name); 		<--TRUE: "Bob" is equal to "Bob"

			call new twice--because Strings are objects, not primitives:
			String [] names = new String [100];
			names[0] = new String("Alice");
			names[1] = new String("Bob");
			..
			..etc.

			Call new once for arrays of primitives:
			int [] ages = new int [100];


		DECLARING an ARRAY:
			int[] numbers; <--this does not allocate memory for the array
			numbers = new int[100];

		vs.

		DECLARING and INITIALIZING an ARRAY:
			int [] numbers = new int[100];
				OR <--BOTH of these allocate memory for the array at once.
			int numbers[] = new int[100];

		HARD-CODING VALUES in an ARRAY:
			int array[] = new int[4]; <--initializes to all zeroes.
			array [0] = 1;
			array [1] = 2;
			array [2] = 3;
			array [3] = 4;
				OR
			double [] grades = {75, 85, 81, 82};
	*/
	public static void main (String [] args)
	{
	}//End main.
}//End class.
