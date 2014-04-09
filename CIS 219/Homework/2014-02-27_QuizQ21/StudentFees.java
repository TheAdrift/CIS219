/*	Cameron Gayford
	2014-02-27
	Quiz -- Question #21
*/
import java.text.*;

public class StudentFees
{
	static final double TUITION = 200.00;
	static final double COURSE_FLAT = 100.00;
	static final double COURSE_RATE = 45.00;

	public static double getCourseFee (double credits)
	{
		credits = Math.abs(credits);
		return COURSE_FLAT + (credits * COURSE_RATE);
	}//End getCourseFee(double)

	public static void main (String [] args)
	{
		System.out.print("Would you like to calculate a student's tuition and fees?"
							+ "\n\t( y / n )\t");
		char go = GetInput.readLineNonwhiteChar();

		switch (go)
		{
			case ('y'):
			case ('Y'):	char run = ' ';
						int studentID = 0;
						double courseFee = 0;
						double totalFee = 0;
						double creditHours = 0;

						DecimalFormat money = new DecimalFormat("$ " + "##,##0.00");

						do
						{
							System.out.print("Enter numeric Student ID:\t");
							studentID = GetInput.readLineInt();
							System.out.print(
								"How many credit hours this semester?\t");
							creditHours = GetInput.readLineDouble();
							courseFee = getCourseFee(creditHours);
							totalFee = TUITION + courseFee;
							System.out.println("\n\nFEES for Student " + studentID
									+ "\n\tTUITION:    "+ money.format(TUITION)
									+ "\n\tCOURSE FEE: "+ money.format(courseFee)
									+ "\n\t==========="
									+ "\n\tTOTAL FEE:  "+ money.format(totalFee));

							System.out.print("\n\nCalculate another student's fees?"
											+" ( y / n )\t");
							run = GetInput.readLineNonwhiteChar();
						}while ((run == 'y')||(run == 'Y'));//End input loop.

			default:	System.out.println("Thank you. Program will exit.");
		}

		java.util.Date now = new java.util.Date();
		System.out.println("\n\nEOJ\nPROGRAM TERMINATED @ " + now);
	}//End main method.
}//End class.