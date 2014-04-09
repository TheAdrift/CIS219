public class Rain
{

  public static void main(String [] args)
  {
    int limit = 0;  // used to store number of elements in the array
    System.out.print("How many elements do you want to store? ");
    limit = GetInput.readLineInt();
    int rainfall [] = new int[limit];
    rainfall[0] = 4;
    rainfall[1] = 5;
    rainfall[2] = 10;

    int total = 0;  //used to store the total of all the elements

    for (int s=0; s <= rainfall.length; ++s)
        total = total + rainfall[s];

    System.out.println("Total of all elemements -> "+total);
    System.out.println("\n\tA quote by Abraham Lincoln:");
    System.out.println("\t\"Whatever you are, be a good one!\"");
    System.out.println("\n\tThe end of the program!");
  } //end of main
} //end of class leapyear