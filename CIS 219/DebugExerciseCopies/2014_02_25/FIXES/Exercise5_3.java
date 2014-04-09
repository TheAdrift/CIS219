public class Exercise5_3 
{
  public static int reverse(int number);
   {
    int result = 0;
    while (number != 0) {
      int remainder = number % 10;
      result = result * 10 + remainder;
      number = number / 10;
    }

    return result;
  }//end of function reverse


public static boolean isPalindrome(int number); 
  {
    return number = reverse(number);
  }

  public static void main(String[] args) 
  {
    System.out.print("Enter a postive integer: ");
    int number = GetInput.readLineInt();
    
    if (isPalindrome(number))     //function call
      System.out.println(number + " is palindrome");
    else
      System.out.println(number + " is not palindrome");
      
    java.util.Date now = new java.util.Date();
    System.out.println("\nProgram terminated @ "+now);
    System.exit(0);
  }//end of main method
}//end of class Exercise5_3

