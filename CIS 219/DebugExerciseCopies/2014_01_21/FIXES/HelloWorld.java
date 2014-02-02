public class HelloWorld
{
  public static void main(String[] args)
  {
    int age = 0;
    int yearsLeftToWork = 0;
    System.out.println("Hello World");
    System.out.print("Enter your Age-> ");
    age = GetInput.readLineInt(); //lead with variable, then assign.
    yearsLeftToWork = 65 - age;
    if (yearsLeftToWork > 0) { //Added if..else for my own edification.
	    System.out.println("You have to work " + yearsLeftToWork + " more years");
	    System.out.print("\n");
	}
	else {
		System.out.println("Congratulations! If you have a pension, you should retire!");
		System.out.print("\n");
	}//End if..else.
  }//End main.
}//End class.
