public class Exercise2_2 
{
  public static void main(String[] args) 
  {
    // Enter radius of the cylinder
    System.out.print("Enter radius of the cylinder: ");
    double radius = Getinput.readLineDouble();

    // Enter length of the cylinder
    System.out.print("Enter length of the cylinder: ");
    double length = Get_Input.readLineDouble();

    double volume = radius * radius * 3.14159 * length;
    
    // Could this program use Math.pow(radius,2)
    // if so can you plug that in where it belongs

    System.out.println("The volume of the cylinder is " + volume);
  }
}
