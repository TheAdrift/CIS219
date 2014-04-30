public class Exercise6_1_b {
  /** Main method */
  public static void main(String[] args) {

    // Get number of students
    System.out.print("Enter number of students: ");
    int numberOfStudents = GetInput.readLineInt();

    int[] scores = new int[numberOfStudents]; // Array scores
    int best = 0; // The best score
    char grade; // The grade

    // Read scores and find the best score
    System.out.print("Enter " + numberOfStudents + " scores: ");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = GetInput.readLineInt();

      if (scores[i] > best)
        best = scores[i];
    }

    // Declare and initialize output string
    String output = "";

	try
	{
    // Assign and display grades
    for (int n = 0; n < scores.length; n++) {
      if (scores[n] >= best - 10)
        grade = 'A';
      else if (scores[n] >= best - 20)
        grade = 'B';
      else if (scores[n] >= best - 30)
        grade = 'C';
      else if (scores[n] >= best - 40)
        grade = 'D';
      else
        grade = 'F';

      output += "Student " + n + " score is " +
        scores[n] + " and grade is " + grade + "\n";
    	}
	}//End try block
	catch (ArrayIndexOutOfBoundsException x)
	{
		System.out.println("RUNTIME ERROR has occured\n"
		+ "SUBSCRIPT out of range, past array maximum.\n"
		+ "Error: " + x);

    // Display the result
    System.out.println(output);
	}//End catch block
  }
}
