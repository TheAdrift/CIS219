/*	Author:	Cameron Gayford
	email:	camgayford@gmail.com
	Course:	CIS 219
	Date:	2014-02-18
*/

public class MathQuizGenerator
{
	/**	addition(num1, num2)	-- creates an addition problem
	*	with num1 and num2, prompts the user for an answer.
	* 	If user answers correctly, we award a score (an integer,
	* 	halved for each incorrect attempt, from a maximum 10 to
	* 	a minimum 2). After 3 failed attempts, score is 0.
	* 	Returns pointScore.
	*/
	public static int addition(double num1, double num2)
	{
		int pointScore = 10;
		double correct = num1 + num2;
		double answer = 0;
		do
		{
			System.out.print(num1 + " + " + num2 + "== ?\t");
			answer = GetInput.readLineDouble();
			if (answer != correct)
			{
				pointScore = pointScore/2;
				System.out.println("I'm sorry, that is not correct.\n"
									+ "Try again:\n");
			}
		} while ((answer != correct) && (pointScore >= 2));
		
		System.out.println("That is correct!\nYou scored " + pointScore
							+ " points for this problem.\n");
	}//end function addition(num1, num2).

	public static void subtraction(double num1, double num2)
	{
	}//end function subtraction(num1, num2).

	public static void multiplication(double num1, double num2)
	{
	}//end function multiplication(num1, num2).

	public static void division(double num1, double num2)
	{
	}//end function division(num1, num2).

	/**	genAdd( n, low, high ) -- Generates n addition problems.
	*	Each problem selects two numbers in range [low, high]
	*	compares with the addition operation, and prompts the user
	*	for a solution.
	*/
	public static void genAdd(int n, double low, double high)//Generate n addition problems.
	{
	}//end function genAdd(n, low, high).

	public static void genSub(int n)//Generate n subtraction probs.
	{
	}//end function genSub(n, low, high).

	public static void genMul(int n, double low, double high)//Generate n multiplication probs.
	{
	}//end function genMul(n, low, high).

	public static void genDiv(int n, double low, double high)//Generate n division problems.
	{
	}//end function genDiv(n, low, high).

	public static void genRand(int n, double low, double high)//Generate n problems, each selected at random.
	{
	}//end function genRand(n, low, high).
} //End class MathQuizGenerator.
