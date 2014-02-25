/*......................................................................
	Author: Cameron Gayford
	Date:	2014-02-24
	Course:	CIS 219
	email:	camgayford@gmail.com
*/

import java.text.*;

public class MathGame
{
	//Constants and public vars:
	final static int MAXPOINT = 10;
	static int scoreTotal = 0;
	double scoreAvg = 0;

	/**	addition(num1, num2) -- adds int num1 to int num2,
	*	promts user for solution. If solution is correct, assign
	*	a score according to formula: maxPoint / (2 * attempts)
	*	When score is less than 2, set score = 0 and no more attempts
	*	are rewarded.
	*	Returns int score.
	*/

	public static int addition(int num1, int num2)
	{
		int correct = num1 + num2;
		int answer = 0;
		int score = MAXPOINT*2;
		do {
			score = score/2;//On first read, score == MAXPOINT now
			if (score < 2)
				score = 0;//Final input permitted, but not scored.
			System.out.println("[This problem is now worth "
								+ score + " points]");
			System.out.print("\n\t" + num1 + " + " + num2
							+ " == ?\t");
			answer = GetInput.readLineInt();
			if (answer != correct)//Give user feedback.
			{
				System.out.println("I'm sorry, " + answer
						+ " is not correct.");
			} else
			{
				System.out.println("Yes! " + answer
						+ " is correct.");
			}
		} while ((answer != correct) && (score >= 2));

		System.out.println("You have earned " + score
							+ " points for this problem.\n");
		return score;
	}//End function addition(int, int)

	/**	subtraction(num1, num2) -- first arranges num1 >= num2.
	*	then subtracts int num2 from int num1 and prompts user for
	*	solution. If solution is correct, assign a score according
	*	to formula: maxPoint / (2 * attempts)
	*	When score is less than 2, set score = 0 and no more attempts
	*	are rewarded.
	*	Returns int score.
	*/

	public static int subtraction(int num1, int num2)
	{
		if (num1 < num2)	//Ensure num1 >= num2
		{
			int swapper = num2;
			num2 = num1; num1 = swapper;
		}

		int correct = num1 - num2;
		int answer = 0;
		int score = MAXPOINT*2;
		do {
			score = score/2;//On first read, score == MAXPOINT now
			if (score < 2)
				score = 0;//Final input permitted, but not scored.
			System.out.println("[This problem is now worth "
								+ score + " points]");
			System.out.print("\n\t" + num1 + " - " + num2
							+ " == ?\t");
			answer = GetInput.readLineInt();
			if (answer != correct)//Give user feedback.
			{
				System.out.println("I'm sorry, " + answer
						+ " is not correct.");
			} else
			{
				System.out.println("Yes! " + answer
						+ " is correct.");
			}
		} while ((answer != correct) && (score >= 2));

		System.out.println("You have earned " + score
							+ " points for this problem.\n");
		return score;
	}//End function subtraction(int, int)

	/**	multiplication(num1, num2) -- multiplies int num1 by int num2,
	*	promts user for solution. If solution is correct, assign
	*	a score according to formula: maxPoint / (2 * attempts)
	*	When score is less than 2, set score = 0 and no more attempts
	*	are rewarded.
	*	Returns int score.
	*/

	public static int multiplication(int num1, int num2)
	{
		int correct = num1 * num2;
		int answer = 0;
		int score = MAXPOINT*2;
		do {
			score = score/2;//On first read, score == MAXPOINT now
			if (score < 2)
				score = 0;//Final input permitted, but not scored.
			System.out.println("[This problem is now worth "
								+ score + " points]");
			System.out.print("\n\t" + num1 + " * " + num2
							+ " == ?\t");
			answer = GetInput.readLineInt();
			if (answer != correct)//Give user feedback.
			{
				System.out.println("I'm sorry, " + answer
						+ " is not correct.");
			} else
			{
				System.out.println("Yes! " + answer
						+ " is correct.");
			}
		} while ((answer != correct) && (score >= 2));

		System.out.println("You have earned " + score
							+ " points for this problem.\n");
		return score;
	}//End function multiplication(int, int)

	/**	division(dividend, divisor) -- arrange int dividend >= int divisor,
	*	then if dividend % divisor != 0, subtract remainder from dividend.
	*	Divide dividend by divisor and prompt user for solution.
	*	If solution is correct, assign a score according to formula:
	*	maxPoint / (2 * attempts)
	*	When score is less than 2, set score = 0 and no more attempts
	*	are rewarded.
	*	Returns int score.
	*/

	public static int division(int dividend, int divisor)
	{
		if (dividend < divisor)	//Ensure dividend >= divisor
		{
			int swapper = divisor;
			divisor = dividend; dividend = swapper;
		}

		if (dividend % divisor != 0)//Ensure dividend / divisor evenly.
		{
			int remainder = dividend % divisor;
			dividend = dividend - remainder;
		}

		int correct = dividend / divisor;
		int answer = 0;
		int score = MAXPOINT*2;
		do {
			score = score/2;//On first read, score == MAXPOINT now
			if (score < 2)
				score = 0;//Final input permitted, but not scored.
			System.out.println("[This problem is now worth "
								+ score + " points]");
			System.out.print("\n\t" + dividend + " - " + divisor
							+ " == ?\t");
			answer = GetInput.readLineInt();
			if (answer != correct)//Give user feedback.
			{
				System.out.println("I'm sorry, " + answer
						+ " is not correct.");
			} else
			{
				System.out.println("Yes! " + answer
						+ " is correct.");
			}
		} while ((answer != correct) && (score >= 2));

		System.out.println("You have earned " + score
							+ " points for this problem.\n");
		return score;
	}//End function division(int, int)

	/**	randomRangeInt( low, high ) --	Returns a random integer
	*	in the range from int low to int high (inclusive)
	*/

	public static int randomRangeInt(int low, int high)
	{
		int range = Math.abs(high - low);

		if (high < low)
			return (int) (Math.random() * range) + high;
		else
			return (int) (Math.random() * range) + low;
	}//End randomRangeInt(int, int)

	/**	generateAdd(num, low, high) -- generates (int num) addition
	*	problems using random numbers in range [int low, int high].
	*	User scores points on each problem according to solutions.
	*	Calculates a point score and percent average from user performance.
	*/

	public static void generateAdd(int num, int low, int high)
	{
		num = Math.abs(num); //Handle bad input
		int pointScore = 0;
		System.out.println("\nLet\'s try " + num + " addition problems.\n");

		for (int i = 0; i < num; i++) //loop controlled by param num.
		{
			//Choose two random numbers between low and high
			int first = randomRangeInt(low, high);
			int second = randomRangeInt(low, high);

			//Generate a problem and tally user's score.
			pointScore += addition(first, second);
			System.out.println("Your current score is: " + pointScore
								+ " out of a possible " + (i+1) * MAXPOINT);
		}//End for loop.

		double pointAvg = (100.0 * pointScore) / (num * MAXPOINT);

		DecimalFormat percent = new DecimalFormat("##0.0");
		System.out.println("\n\tYour final score: \n\t\t" + pointScore
							+ " points out of " + (num * MAXPOINT)
							+ "\n\t\tFor an average of "
							+ percent.format(pointAvg) + "%");
	}//End function generateAdd(int, int, int)

	public static void main(String [] args)
	{
		/*A dummy problem to test methods.
		int foo = 100; int bar = 0;
		scoreTotal = division(foo, bar);
		System.out.println(scoreTotal);
		//*/
		//*
		generateAdd(2, 0, 50);
		//*/
	}//End main method.

}//End class
