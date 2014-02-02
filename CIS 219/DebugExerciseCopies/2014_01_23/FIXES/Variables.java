/*
Variables - in programming referes to something that can change.
Variables are used to store data in a program.  To use a variable, you declare it by
              telling the compiler its name as well as what type of data it represents.

In elementary mathematics, a variable is an alphabetic character representing a number
which is either arbitrary or not specified or unknown.

*/
public class Variables
{
	public static void main(String [] args)
	{
	    byte i = 100;
	    short a = 900;
	    int  x = 259;
	    long k = i * 3000 + x;
	    float incomeTax = 0.31f;
	    double income = 42000.50;
	    int money = (int) income; //cast - truncates decimal points

	    int day = (int) Math.pow(4, 3); //Casting is necessary when expression always yields a particular data type

	    double z = 1.23456e+2;

        // constants - refer to things that do not change
        /*NOTE TO SELF: Good form declares these near the top of code;
        This helps make code more modular, avoids using numerals in code body.
        Easier to update with different constants. */

        final double numberOfPlayers = 3; //3 people play cutthroat in Racquetball

        /* An identifier is a sequence of characters that consists of letters, digits,
           underscores and dollar sign */
        double interestRate2014;
        interestRate2014 = 0.06;
        char grade='A'; //char is always declared in single quotes, ''
        String myGrade = "A+"; //String is always capitalized, always declared with double quotes, ""
        int age = 0;

        System.out.print("How old are you? ");
        age = GetInput.readLineInt();

        //Print variables from above section.
        System.out.println(
			"i -> " + i + "\n" +
			"a -> " + a + "\n" +
			"x -> " + x + "\n" +
			"k -> " + k + "\n" +
			"incomeTax -> " + incomeTax + "\n" +
			"income -> " + income + "\n" +
			"money -> " + money + "\n" +
			"day -> " + day + "\n" +
			"z -> " + z + "\n" +
			"numberOfPlayers -> " + numberOfPlayers + "\n" +
			"interestRate2014 -> " + interestRate2014 + "\n" +
			"grade = " + grade + "\n" +
			"myGrade = " + myGrade + "\n" +
			"age = " + age + "\n"
			);

		System.out.println("\n\n\tThe End\n");
	}//end of main method
}//end of class