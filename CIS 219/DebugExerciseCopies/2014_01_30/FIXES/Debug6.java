/**********************************************************
Write a Java program that reads a student name using GetInput.

Next, compares the students answers in variables answer1 ... answer8
to a teachers key for a given quiz. The teacher made all the correct
answers to the quiz True.  Thus, the teacher's key is all T's.

Compute the student's grade.  numberCorrect / totalQty of questions * 100

This program has logic errors
************************************************************/

public class Debug6
{
	public static void main(String[] args)
	{
	    int correct = 0;//count correct answers
	    double average = 0.0; //used to computer student's average
	    final double Q = 8.0; //number of questions on the test
		//create variables to store student name and answers
		String name = new String();
		//how do you enter the student's name into this program
		//The student's 8 answers to the quiz are below
		char answer1 = 'T';
		char answer2 = 'F';
		char answer3 = 'T';
		char answer4 = 'T';
		char answer5 = 'T';
		char answer6 = 'T';
		char answer7 = 'T';
		char answer8 = 'F';

		System.out.println("Please enter in student name");
		//name = GetInput.readLine();//<--I would probably use two fields and concatenate.
		//* like so:
		String firstName = new String(); String lastName = new String();
		System.out.print("Please enter student given name ->"); firstName = GetInput.readLineWord();
		System.out.print("Please enter student family name ->"); lastName = GetInput.readLineWord();
		name = firstName + " " + lastName; //*/

		if (answer1 == 'T')
		   ++correct;
		if (answer2 == 'T')
		   correct = correct+1;
		if (answer3 == 'T')
		   ++correct;
		if (answer4 == 'T')
		   ++correct;
		if (answer5 == 'T')
		   ++correct;
		if (answer6 == 'T')
		   ++correct;
		if (answer7 == 'T')
		   ++correct;
		if (answer8 == 'T')
		   ++correct;

		average = (correct / Q)*100 ;

		System.out.println("Number of questions answered correctly: " + correct);
		System.out.println(name +"'s score on the quiz is -> " + average + "%");

        System.out.println("\n\nEnd of Program\t"+getSystemDateTime()+"\n");
	}//end the main method


public static String getSystemDateTime()
  {
    java.util.Date date = new java.util.Date();

    return (date.toString());
  } //end of static method to get current date
}// end CLASS