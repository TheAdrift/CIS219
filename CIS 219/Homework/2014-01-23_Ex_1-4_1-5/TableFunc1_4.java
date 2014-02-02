/*	Author:	Cameron Gayford
	Date:	2014-01-21
	Course:	CIS 219
	email:	camgayford@gmail.com	*/

public class TableFunc1_4
{//Display a table of exponents with given elements, powers 0 through 3 across, rows from int a to int finish.
	public static void tablePowers (int a, int finish)
	{
		//* Lay out the table.
		System.out.println("a" + "\t" + "a^2" + "\t" + "a^3" + "\n");
		do {
			//print a, then a^2, then a^3, as a table row.
			System.out.println( a + "\t" + (Math.pow(a, 2)) + "\t" + (Math.pow(a, 3)) + "\n");
			a++;
			} while(a <= finish); //when a reaches the finishing value, stop.
		//*/
	}//End function tablePowers

	public static void main (String [] args)
	{
		tablePowers (1, 4);
	}//End main.
}