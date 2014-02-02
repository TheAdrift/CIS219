public class Volume
{
  public static void main(String[] args)
  {
    // Enter radius of the cylinder
    //aks user for "Enter radius of the cylinder: "
    // get double value using GetInput
    System.out.println("Enter radius of cylinder: ");
    double radius = GetInput.readLineDouble();

    // Enter length of the cylinder
    //aks user "Enter length of the cylinder: "
    // get double value using GetInput
    System.out.println("Enter length of cylinder: ");
    double length = GetInput.readLineDouble();

     //volume = Math.pow(radius, * 3.14159 * length;

    // Could this program use Math.pow(radius,2)
    // if so can you plug that in where it belongs

    double volume = Math.pow(radius, 2) * Math.PI * length;

    System.out.println("The volume of the cylinder is " + volume);
  }
}
