//DEBUG3 Program
//This program asks the user to enter his/her weight
//Determines the user's weight on the planet Mars

public class Debug3
{
public static void main(String [] args)
  {
  int earthWeight = 0;
  double marsWeight = 0.0;

  System.out.println("Please enter your weight to the nearest pound:");
  earthWeight = GetInput.readLineInt();
  //earthWeight = 162; //commented out for the fun of it.
  marsWeight = 0.34 * earthWeight;//variable assigned comes before expression to be assigned
  System.out.print("\nYour weight on Mars is "+marsWeight + "\n");
  }//end of main method
}//end of class
