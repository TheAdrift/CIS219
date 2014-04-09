public class DebugFive2
// Prints odd numbers
// Prints new line after every 10, or every X (argument sent to printIT)
{
   public static void printIT(int X)
   {
	 int num, count = 0;
     for(num = 1; num <= 100; num += 2)
       System.out.print("  " + num);
       ++count;
       if(count == X)
         count = 0;
         System.out.println();
   }

   public static void main(String[] args)
   {
   try
     {
     printIT();
  	 }
   catch (Exception e)
     {
		 System.out.println("some RUN-TIME error has occured");
	 }

     System.out.println("End of odd numbers\n\tEOJ\n");
     java.util.Date now = new java.util.Date();
     System.out.println("Terminated at "+now);
     System.exit(0);
    }//end of main method
}//end of class