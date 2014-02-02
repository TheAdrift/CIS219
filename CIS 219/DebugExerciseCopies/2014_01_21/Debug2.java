 /**--------------------------------------------------------------------
 *|     This Program Written by.....    Jim Habermas
 *|     Email address ..............    JRHabermas@genesee.edu
 *|     Assignment Name ............    t:\cis219\2013_01_24\
 *|     Class ......................    CIS219
 *|     Date .......................    January 2014
 *|     Notes
 *|          pre-increment of x
  --------------------------------------------------------------------*/
public class Debug2
// prints a table of values
{
  public static void main(String args[])
  {
      int x = 5;
      System.out.println("Number    Its Double      Its Triple");
      System.out.println(x + "\t\t" + (x*2) + "\t\t" + (x*3));
      ++x;
      System.out.println(x + "\t\t" + (x*2) + "\t\t" + (x*3));

      java.util.Date today = new java.util.Date();
      System.out.println("\nEnd of Program\nTerminated @"+today);
   }//end of the main
}//end of class