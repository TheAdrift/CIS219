/*
Variables - in programming referes to something that can change.
Variables are used to store data in a program.  To use a variable, you declare it by 
              telling the compiler its name as well as what type of data it represents.

In elementary mathematics, a variable is an alphabetic character representing a number 
which is either arbitrary or not specified or unknown.

*/
public class Variables
{
	public static void main()
	{
	    byte i = 100;
	    short a = 900;
	    int  x = 259;
	    long k = i * 3000 + x;
	    float incomeTax = 0.31f;
	    double income = 42000.50;
	    int money = (int) income; //cast - truncates decimal points
	    double z = 1.23456e+2;
        
        // constants - refere to things that do not change
        final double numberOfPlayers = 3; //3 people play cutthroat in Racquetball
        
        /* An identifier is a sequence of characters that consists of letters, digits,
           underscores and dollar sign */
        double interestRate2014
        interestRate2014 = 0.06;   
        char grade='A';
        String myGrade = "A+";
        int age = 0;
        System.out.print("How old are you? ");
        age = GetInput.readLineInt();
		System.out.println("\n\n\tThe End\n");
	}//end of main method
}//end of class