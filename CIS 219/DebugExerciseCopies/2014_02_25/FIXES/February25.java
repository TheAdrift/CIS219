public class February25                    //methods Starting Chapter 5
{
	public static int max(int a, int b, int c)  //method or function to find the highest
	{                                           // of 3 numbers.
		int highNumber = 0;
	                                            //Assume, a,b,c are all unique values.
		if (a > b )
		   if (a > c)
		      highNumber = a;
		   else
		      highNumber = c;
		else
		   if (b > c)
		      highNumber = b;
		   else
		      highNumber = c;

		return highNumber;
	}//end of method named max




   public static void main(String [] args)
   {
     double a, b, c;
     int answer = 0;
     System.out.print("Enter in value for a-> ");
     a = readLineDouble();
     System.out.print("Enter in value for b-> ");
     b = readLineDouble();
     System.out.print("Enter in value for a-> ");
     c = readLinedouble();
     answer = max(a,b,c);

     System.out.println("\tThe highest number you inputed was -> "+answer);
     System.out.println("End of Program\n");

   }//end of main
}//end of class