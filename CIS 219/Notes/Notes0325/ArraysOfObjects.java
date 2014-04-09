public class ArraysOfObjects
{

  public static void main(String [] args)
  {
	int counter = 0;
    String [] suitNames = new String[4];
    try
    {
    System.out.print("Enter suit 1 ->");
    suitNames[counter] = new String(GetInput.readLine());
    counter = counter + 1;
    System.out.print("Enter suit 2 ->");
    suitNames[counter] = new String(GetInput.readLine());
    counter = counter + 1;
	System.out.print("Enter suit 3 ->");
    suitNames[counter] = new String(GetInput.readLine());
    counter = counter + 1;
	System.out.print("Enter suit 4 ->");
    suitNames[counter] = new String(GetInput.readLine());
    System.out.println("\n\tA quote by Abraham Lincoln:");
    System.out.println("\t\"Whatever you are, be a good one!\"");
    System.out.println("\n\tThe end of the program!");
    }
    catch (ArrayIndexOutOfBoundsException x)
    {
		System.out.println("Array index past limit or");
		System.out.println("Array index below zero");
		System.out.println(x);

	}
    catch (Exception xx)
    {
		System.out.println("Some run-time error has occured");
		System.out.println("ERROR MESSAGE:"+xx);
	}
    System.out.println("END of PROGRAM");
  } //end of main
} //end of class leapyear