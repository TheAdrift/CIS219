/*
   Project 1 part 1 Leap year
   Programmer:	   Jim Habermas   JRHabermas@genesee.edu
   Date: 	   October 15, 2009
   Program Name:   LeapyearV3.java
 */

public class LeapyearV3
{
  private int whatYear;

  LeapyearV3()
  {
    whatYear = 2009;
  } //end of constructor

  LeapyearV3(int y)
  {
    whatYear = y;
  } // overloaded constructor end of constructor

  public boolean IsLeapYear()
  {
    return (whatYear % 4 == 0) &&
        ( (whatYear % 100 != 0) || (whatYear % 400 == 0));
  } //end of member function to check if year is a leap year

  int getyear()
  {
    return (whatYear);
  } //end of getter function to get private data

  public static void main(String [] args)
  {
	System.out.println("Debug -->"+args.length+"\n");
	System.out.println("Length of command line arguments \"args\" is -->"+
	                    + args.length);
	if (args.length > 0)
	    for (int z = 0; z < args.length ; z = z + 1)
	    	System.out.println("args["+z+"]-->"+args[z]);
    else
        System.out.println("NOTHING IS IN args[]\n");

    System.out.println("Can you compute when is a Leap year?");

    LeapyearV3 store;
    int y = 0;

    if (args.length > 0)
    {
      System.out.println("Provided command line input of " + args[0]);
      y = Integer.parseInt(args[0]);
      store = new LeapyearV3(y); //will call constructor with 1 argument
    }
    else
    {
      store = new LeapyearV3(); //will call constructor with 0 arguments
    }

    System.out.println("\nYear and True or False (true means leap year)");
    System.out.print(store.getyear() + " " + store.IsLeapYear() + "\n");

    LeapyearV3 object = new LeapyearV3(2012);
    System.out.print(object.getyear() + " " + object.IsLeapYear() + "\n");
    System.out.println("\n\tA quote by Abraham Lincoln:");
    System.out.println("\t\"Whatever you are, be a good one!\"");
    System.out.println("\n\tThe end of the program!");
  } //end of main
} //end of class leapyear