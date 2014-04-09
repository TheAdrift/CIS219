/*
* Made by Jacob Smith on 2/19/14
* CIS219 Debug
* In mathmatics there is a term called the "Detrminate"
* In the process of finding a determinate we need to find
* every possible order of numbers,without repeating terms.
* for example the numbers 123 could be written 6 ways
* 123,132,213,231,312,321
* Simularly we can find any combination of numbers of 4 through 8
* including the repeating terms
* By using a loop, we can find all of them
*/
public class Deteriminate
{

	public static void main(String[] args)
	{
		/*the amount of possible combanations is 4  to the fourth power, 256
		So there are 256 possible outputs. To ensure you have the correct amount,
		add a counter that will display how many calculations the program did at the end*/
		int counter = 0;

		for (int m = 4; m<8 ; m++)
		{
		  for (int i = 4; i<8 ; i++)
		  {
			for (int n = 4 ; n<8 ; n++)
			 {
					for(int k = 4 ; k<8 ; k++)
					{
						System.out.print(m);
						System.out.print(i);
						System.out.print(n);
						System.out.print(k);
						System.out.println(" ");
						counter++;
					}//end loop k
		   		}//end loop n
			}//end loop i
		}//end loop m

		System.out.println("\n"+ counter +" calculations.");

	}//end of main
}//end of class
