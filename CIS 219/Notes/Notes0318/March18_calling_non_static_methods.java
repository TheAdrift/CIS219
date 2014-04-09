public class March18_calling_non_static_methods
{
	public static void main (String [] args)
	{
    Circle pool = new Circle();
    System.out.print("How round in feet is your pool ? ");
    double f = GetInput.readLineDouble();
    pool.setRadius(f);
    System.out.println("Area of pool -> "+pool.getArea());
    System.out.println("Diameter -----> "+pool.getDiameter());
    }
}