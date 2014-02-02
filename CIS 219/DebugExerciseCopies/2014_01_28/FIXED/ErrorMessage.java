// Analyze the following code
public class ErrorMessage
{
  public static void main(String[] args)
  {
    long n = 0;

    n = 10000l * 10000l * 10000l;
    if (n > Integer.MAX_VALUE)
       {
       System.out.println("Answer must be a long value -->"+n);
       }
    else
       {
        System.out.println("Results can fit into an int -->"+(int) n);
        }
    System.out.println("\n\nEND OF PROGRAM\n");
  }//end of main
}//end of ErrorMessage class
