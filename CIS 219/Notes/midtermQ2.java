/*-----*******--------------------------------------------------------\
 |     This Program Written by.....    James Habermas                  |
 |     Author's email .............    JRHabermas@genesee.edu          |
 |     Assignment Name ............    Midterm question 2              |
 |     Filename Name ..............    midtermQ2.java                  |
 |     Stored on Jump Drive 256 MB                                     |
 \*-------------------------------------------------------------------*/
import java.text.*;

public class midtermQ2
{
	public static float up(int x, int  y, int z)
	{
		++x;
		y++;
		z=z+1;

		return (0.0f);
	}//end of static method up

	public static void down(int  b, int  c)
	{
		b=b-1;
		c=c-1;
    }//end of static method down

    public static float compute(int a, int b, int c)
    {
       float answer;
       answer = up(a,b,c);
       down(b, c);
       System.out.println("\n\n\tIn compute-->"+ a+ " "+b+" "+c);
       answer=(float) (a+b)/(1.0f*c);
       return answer;
    }//end of method compute






  /**************************  M A I N     M E T H O D   ****************************/
  public static void main(String [] args)
  {
	System.out.println("\nWhat is outputed from the following method call?");


	DecimalFormat twoDigitsPastPoint = new DecimalFormat("##0.00");
	//Pattern '0' stands for compulsory digit
    //Pattern '#' stands for an optional digit

    System.out.println("\n\tANSWER #1 -->"+twoDigitsPastPoint.format(compute(0,4,4)));

	System.out.println("\n\nPress any key to STOP midterm\n");
   }//end main method

}//end of class midtermQ2