public class Exercise2_3
{
  public static void main(String[] args)
  {
    // Enter foot value
    System.out.print("Enter a value for feet: ");
    double feet =  GetInput.readLineDouble();

    double meters = feet * 0.305; //Convert to meters.

    System.out.println(feet + " feet is " + meters + " meters");
  }//end of main method
}//end of class
