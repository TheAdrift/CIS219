//finish and debug
//February 20 Debug programs
public class Exponent
{
public static int squareIT(int x)
{
	int answer = 0;
	answer = (int) Math.pow(x,2);
	return answer;
}//end of method squareIT

public static int cubeIT(int x)
{
	int answer = 0;
	answer = (int) Math.pow(x,3);
}//end of method cubeIT



public static void main(String [] args)
  {
   System.out.println("4 squared is -->"+squareIT(4));
   System.out.println("4 cubed is ---->" cubeIT(4));
   System.out.println("\nEOJ\n");
  }
}
