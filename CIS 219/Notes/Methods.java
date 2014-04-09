import java.io.*;
import java.util.*;
public class Methods
{
public static int max(int a, int b)
{
	int answer = 0;//assign highest formal argument into answer
	if (a >= b)
	   answer = a;
	else
	   answer = b;

	return answer;
}//end of max with two int arguments

public static int max(int a, int b, int c)
{
	int answer = 0;//assign highest formal argument into answer
	if (a >= b)
	   if (a > c)
	       answer = a;
	   else
	       answer = c;
	else
	   if (b > c)
	      answer = b;
	   else
	      answer = c;
	return answer;
}//end of max with two int arguments

public static double computeCelsius(double f)
{
	double answer = (5.0/9.0) * (f - 32);
	return (answer);
}//end of method

public static void EOJ()
{
    System.out.println("End of Program");
}//end of method EOJ


public static void main(String [] args)
{
	double  c = 0;
	c = computeCelsius(GetInput.readLineDouble());//call and accept the return value
	System.out.println("Celsius is "+ c);
	int age;
	System.out.print("How old are you? ");
	age = GetInput.readLineInt();

    System.out.print("Please enter in a number->");
    int num1 = GetInput.readLineInt();
    System.out.print("Please enter in a number->");
    int num2 = GetInput.readLineInt();

	System.out.println("The maximum number is ->"+ max(num1, num2));
	System.out.print("Pleae enter in a number -->");
	int number3 = GetInput.readLineInt();
	System.out.println("The maximum number is ->"+ max(num1, num2, number3));
	EOJ();//method call   invoke method EOJ
}//end of the main method

}//end of class