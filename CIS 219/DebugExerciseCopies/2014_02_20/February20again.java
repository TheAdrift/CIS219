public class February20again
{
  public static void insurance(double tickets, byte age, String gender)
  {
    if(tickets > 3 || age < 25 && gender == 'M')
      System.out.println("Do not insure");
    if((tickets < 2 || age > 21) && gender == 'F')
      System.out.println("Do insure");
  }//end of void method insurance

  public static void main(String[] args)
  {
    int tickets = 1;
    int age = 40;
    char gender = 'F';
    System.out.println("Car insurance program.");
    insurance(tickets, age, gender);
    System.out.println("\nEOJ\n");
  }
}