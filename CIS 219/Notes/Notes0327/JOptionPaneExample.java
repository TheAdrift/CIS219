/*--------------------------------------------------------------------
 |    This Program Written by.....    Jim Habermas
 |    Assignment Name ............    JOptionPaneExample.java
 |    Assignment # ...............    Sample from end of Chapter 1 but expanded
 |    Class ......................    CIS219
 |    Date .......................    February 12, 2013
 |     Internal Specifications:
 |         Demo of  two unique uses of JOptionPane.showInputDialog
 |         JOptionPane.showMessageDialog
 |     This program was created in textpad and stored on the \\bfs\faculty
 |
 |     Suggestions for Improvement:
 |        Add more comments
 |
 |     Last Updates included:
 |     1)  Added grade_inflation_univercity
 |     2)  was to add (AS) vs (AAS) on degrees
 |     3)  used .length constant to view how many elements
 |           are in the Array (Line 79)
 *--------------------------------------------------------------------*/
import javax.swing.JOptionPane; // import class JOptionPane.
import java.text.DecimalFormat;
/**  Java Doc  Comments - "class-level comments")
 * @author  Jim Habermas
 * Created during Lecture
 This program was created to explain JOptionPane.showMessageDialog
 */

public class JOptionPaneExample
{
  public static void main(String args[])
  {
//figure 13 Welcome to Java!
    JOptionPane.showMessageDialog(null,"Welcome to Java!","Welcome",
                                   JOptionPane.PLAIN_MESSAGE);


		 String [] selectionValues2 = {"Gizmo","Widget"};
		 String product = (String) JOptionPane.showInputDialog(null,"Select product",
		                   "Wallys Widget Store",
		                   JOptionPane.QUESTION_MESSAGE,
		                    null, selectionValues2, selectionValues2[0]);


    JOptionPane.showMessageDialog(null,
       "CIS 219\nInstructor:  Habermas, James\nRoom:  E124\nTime: 10:20pm-12:20pm",
       "Course",JOptionPane.INFORMATION_MESSAGE);

    String ageAlphanumeric; // first string entered by user
    int age = 0; // input data from the user


    String gccMajor = new String(); // variable to hold users input for college major

    String  [] selectionValues = {"Web desgin(AAS)",
                   "Computer Information Systems - CIS (AS)",
                   "CSN(AAS)",
                   "None of the above."};

    String gpaTXT;
    double gpa = 0.0;


    String incomeTXT;
    double income = 0.0;


    incomeTXT = JOptionPane.showInputDialog(
        "What weekly income are you expecting from this job?");

    try
    {
      income = Double.parseDouble(incomeTXT);
    }
    catch (NumberFormatException xxx)
    {
		   JOptionPane.showMessageDialog(null,
		    "ERROR in input data\nMust ONLY enter numeric value for weekly income",
		                  "Error",JOptionPane.ERROR_MESSAGE);
		   incomeTXT = JOptionPane.showInputDialog(
	        "What weekly income are you expecting from this job?");
	       income = Double.parseDouble(incomeTXT);
	}
    catch (Exception yyy)
    {
		JOptionPane.showMessageDialog(null,"ERROR Some RUN-TIME error has occured\n"+yyy,
	                  "Error",JOptionPane.ERROR_MESSAGE);
	}

    double tax = income * 0.33;
    double netIncome = income - tax;
    DecimalFormat money = new DecimalFormat("$#,##0.00");
    JOptionPane.showMessageDialog(null,"Your net income is "+money.format(netIncome)+
          " for the week.",
          "Income message",JOptionPane.PLAIN_MESSAGE);

    gpaTXT = JOptionPane.showInputDialog("Please enter in your GPA");
    gpa = Double.parseDouble(gpaTXT);
    double grade_inflation_univercity = gpa + 0.4f;

    DecimalFormat mine = new DecimalFormat("0.00");

    JOptionPane.showMessageDialog(null, "Welcome to CIS19 (Java)\n"+
           "Updated GPA ->"+mine.format(grade_inflation_univercity),
           "Title",
           JOptionPane.INFORMATION_MESSAGE);

    // read in first number from user as a string
    ageAlphanumeric =
        JOptionPane.showInputDialog("Please enter in your age");

    try
    {
      age = Integer.parseInt(ageAlphanumeric);
    } //end of try block
    catch (NumberFormatException e)
    {
	  System.out.println("ERROR ERROR - Bad input data!");
	  System.out.println("Error message -> "+e);

      ageAlphanumeric =
          JOptionPane.showInputDialog("Please enter in your age");
    } //end of catch block
    age = Integer.parseInt(ageAlphanumeric);


    gccMajor = (String) JOptionPane.showInputDialog(null,"Select your degree","GCC",
                 JOptionPane.QUESTION_MESSAGE,
                 null,
                  selectionValues,
                  selectionValues[0]);

    System.out.println("Pull down menu using JOptionPane sample");
    System.out.println("Qty of choices in pull menu:" + selectionValues.length);
    System.out.println(gccMajor+" <- GCC Major area of study.");

    if (gccMajor.equals("None of the above."))
      System.out.println(
          "\n\nThink about were you might want to transfer to next year.");
    else
    if ((gccMajor.equals("Computer Information Systems - CIS (AS)")) ||
         (gccMajor.equals("Web desgin(AAS)")))
      System.out.println("\n\nJames Habermas should be your advisor for CIS or Web design");
    else
      System.out.println(
          "Get your Application into your next school in the next 30 days.");

     java.util.Date now = new java.util.Date();
     System.out.println("\n\nProgram terminated at: "+now+"\n");
     System.exit(0);
  } //end of main
} //end of class