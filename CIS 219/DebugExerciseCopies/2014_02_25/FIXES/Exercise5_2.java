// Exercise5_2.java: Create a method for summarizing digits in an int
public class Exercise5_2 
{
  public static void main(String[] args) 
  {
    System.out.print("Enter a number: ");
    int value = GetInput.readLineInt();

    System.out.println("The sum of digits for " + value +
      " is " + sumDigits(value));//function class sending value as a parameter
    System.out.println("\nEND OF PROGRAM\n");
    System.exit(0);
  }//end of main method

  public static void sumDigits(long n);
   {
    int temp = (int)Math.abs(n);
    int sum = 0;

    while (temp != 0) {
      int remainder = temp % 10;
      sum += remainder;
      temp = temp / 10;
    }

    return sum;
  }//end of function to return sumDigits
}//end of method
