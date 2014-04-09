public class ComputeCircArea
{
	public static void main(String [] args)
	{//We're going to compute the area of a circle.
		//*
		float r = 8f;
		float area = (float) (Math.pow(r, 2)*Math.PI) ;
		System.out.println("Radius = " + r + "\n" + "Area = " + area + "\n"); //For personal edification and practice, print the answer as-is.
		/*
		double dblArea = (double) area ; //Will need to handle significant figures, probably use a rounding function.
		System.out.println("Radius = " + r + "\n" + "Area = " + dblArea + "\n"); //We don't need the answer to be huge, so print as a double.
		//*/
	}
}