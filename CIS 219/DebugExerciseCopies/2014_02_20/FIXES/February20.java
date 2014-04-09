public class February20
// Adds your bill for burger and fries
  {
    public static void main(string[] args) throws Exception
	  {
		char usersChoice;
	    double bill = 0.0;
		System.out.print("Do you want a burger (Y/N)? ");

		usersChoice  = GetInput.readLineInt();

		if((usersChoice = 'y') || (usersChoice = 'Y'))
		  {
		  bill += 2.59;
		  System.out.print("Fries with that (Y/N)? ");
          usersChoice= Character.toLowerCase(GetInput);
          if (usersChoice == 'y')
                  bill += .89;
	  	  }//end of if statement for if you want a burger

         System.out.println("Bill is " + bill);
         System.out.println("\tEND OF PROGRAM\n");

	}
}
