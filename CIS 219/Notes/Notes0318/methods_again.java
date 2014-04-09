public class methods_again
{
	public static void main(String [] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int answer = 0;       //a,b,c could be constants
		answer = doIt(5,10,5); //a,b,c actual arguments
		System.out.println("Answer is -> "+answer);
	}//end of main method

	public static int doIt(int x, int y, int z) //formal parameters
	{
	  int answer = 0;
	  ++x;
	  System.out.println("Value of y before post increment ->"+y);
	  y++;
	  System.out.println("Value of y after post increment -->"+y);
	  z++;
	  answer= x + y + z;
	  return (answer);
	}


}//end of class