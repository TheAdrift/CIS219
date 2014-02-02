public class Exercise2_2
{
  public static void main(String[] args)
  {
    //area of a circle is radius to the second power * PI * length
    // Enter radius of the cylinder
    System.out.print("Enter radius of the cylinder: ");
    double radius = GetInput.readLineDouble();

	System.out.print("Enter length of the cylinder: ");
	double length = GetInput.readLineDouble();

	double area = Math.pow(radius, 2) * Math.PI;
    double volume = Math.pow(radius, 2) * Math.PI * length;



    System.out.println("Area is " + area);
    System.out.println("Volume is " + volume);
  }
}//end of main method
