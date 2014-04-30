/*
	Author:	Cameron Gayford
	Date:	2014-04-24
	Programming problem for Array Quiz
*/
public class ArrayQuizProb
{
	public static void main (String [] args)
	{
		System.out.println("How many elements will be in this array?");
		int elements = GetInput.readLineInt();

		int [] modes = new int[elements];

		//Begin filling modes[] with user input:
		for (int i = 0; i < modes.length; i++)
		{
			do{
				System.out.print("\n\tEnter an integer between 0 and 4 below:"
					+"\n\tValue in element "+i+" = ");
				modes[i] = GetInput.readLineInt();
			} while ((modes[i] > 4)||(modes[i] < 0));
		}//end for-loop to fill modes[]

		//*DEBUG:
		for (int i = 0; i < modes.length; i++)
			System.out.println("["+i+"] -> "+modes[i]);
			//*/
		int modeVal = findMode( modes );
		System.out.println("Mode of this array: "+modeVal);


	}//End main method

	/**	findMode ( int[] array )
	*	Receives an array of integers and calculates the mode of the array.
	*	Returns an integer value of this mode.
	*/
	public static int findMode (int [] array)
	{
		int mode = 0;

		int max = array[0]; int min = array[0];//Find range of values
		for (int k = 0; k < array.length; k++)
		{
			max = (array[k] > max)? array[k] : max;
			min = (array[k] < min)? array[k] : min;
		}//End for-loop to find max and min.

		int [] instanceCount = new int[(max - min) + 1];

		//Count instances in array[] of each value in range min-->max
		for (int n = min; n <= max; n++)//Loop through range of values
		{
			int x = n - min;
			//The subscript of instances[x]is never higher than max - min
			for (int k = 0; k < array.length; k++)//check each element in array
			{
				if (n == array[k])
					instanceCount[x]++;
			}//end inner for-loop
		}//end outer for-loop. This should have filled instanceCount.

		int hiIndex = 0;
		int hiCount = instanceCount[hiIndex];
		//These are related--we want to find hiIndex.
		for (int i = 0; i < instanceCount.length; i++)//find highest instance count
		{
			if (instanceCount[i] > hiCount)
			{
				hiCount = instanceCount[i];
				hiIndex = i;
			}
		}//end instanceCount for-loop.

		mode = hiIndex + min;
		return mode;
	}//End method findMode ( int[] )
}//End class
