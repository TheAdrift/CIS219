public class DebugTwo4
// This program calculates tuition bills
  {
    public static void main(String args[])
	  {
		int myCredits = 15;
		double yourCredits = 16.5;
		double rate = 75.84;
		tuitionBill((double)myCredits, rate);//method call
		tuitionBill(yourCredits,rate);
	  }
    public static void tuitionBill( double c, double r)
	{
	 System.out.println("Total due " + (r*c));
	}
}

