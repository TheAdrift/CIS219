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

		System.out.print("Please enter in student name ->");
		name = get_input.readLine;

		if (answer1 = 'T')
		   correct = correct+1;
		if (answer2 = 'T')
		   correct = correct+1;
		if (answer3 = 'T')
		   correct = correct+1;
		if (answer4 = 'T')
		   correct = correct+1;
		if (answer4 = 'T')
		   correct = correct+1;
		if (answer6 = 'T')
		   correct = correct+1;
		if (answer7 = 'T')
		   correct = correct+1;
		if (answer8 = 'T')
		   correct = correct+1;

		average = ?;

		System.out.println(name +"'s score on the quiz is -> ");

        System.out.println("\n\nEnd of Program\t"+getSystemDateTime()+"\n");
	}//end the main method


public static String getSystemDateTime()
  {
    java.util.Date date = new java.util.Date();

    return (date.toString());
  } //end of static method to get current date
}// end CLASS