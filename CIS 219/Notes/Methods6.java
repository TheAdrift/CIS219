//March 4, 2014 - a program with a method calling a method.
//reduce is a void method
//GCF is a method that returns an int
//The main calls reduce, that calls GCF
import java.text.*;

public class Methods6
{
    public static int GCF(int num, int denom)
    {
        int gcf = 1;
        int i;
        for (i = 2; i <= num; ++i)
        {
            if (((num % i) == 0) && ((denom % i) == 0))
            {
                gcf = i;
            }
        } //end of for loop to find GCF

        return gcf; //return the greatest common factor
    } //end of GCF

    public static void reduceFraction(int num, int denom)
    {
        int ans = 0;
        ans = GCF(num, denom);//call Function sending num & denom.....
        //the ans is giong to receive an value from GCF

        num /= ans;
        denom /= ans; //  denom = denom / ans;

        System.out.println(num + " / " + denom);
    } //end of reduceFraction method

    /**
     * ********************** Main Method *****************************
     */
    public static void main(String[] args)
    {
        System.out.println(20); // 20 is called an "actual argument"
        DecimalFormat twoDigitsPastPoint = new DecimalFormat("##0.00");
        int n, d = 0;
        System.out.print("Please enter in the numerator -->");
        n = GetInput.readLineInt();
        System.out.print("Please enter in the donominator -- >");
        d = GetInput.readLineInt();
        reduceFraction(n, d); // method call (send n & d up to reduceFraction)
        System.out.println("\nEnd of Job\n");
    } //end of main method
} //end of class