public class DebugSix1
// Start with a penny
// Double it every day
// How much do you have in a month?

//  Some logic errors in this code
{
   public static void main(String[] args)
   {
     double money;
     int day;
     while(day > 30)
     {
      money = 2 * money;
      System.out.println("After day " + day +
         " you have " + money);

    }
    System.out.println("End of program");
   }
}