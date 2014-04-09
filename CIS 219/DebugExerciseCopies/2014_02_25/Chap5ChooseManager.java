public class Chap5ChooseManager
{
   static final double CORP_RATE = 75.99;
   static final double PRI_RATE = 47.99;
   static final double NON_PROF_RATE = 40.99;
   
   public static void main(String[] args) throws Exception
   {
	char eventType = ' ';
	double anEvent = 0;
	System.out.println("Enter type of event you are scheduling");
	System.out.println("C for a corporate event");
	System.out.println("P for a private event");
	System.out.println("N for non-profit event");
	eventType=Character.toUpperCase(GetInput.readLineNonwhiteChar());
	while(eventType != 'C' && eventType != 'P' && eventType != 'N')
	{
		System.out.println("Entry must be C or P or N!");
		eventType=Character.toUpperCase(GetInput.readLineNonwhiteChar());
	}
	System.out.print("The manager for this event will be ");
	switch (eventType)
	{
		case 'C':
		  anEvent = processEvent(eventType, CORP_RATE, 8, "Dustin Britt");
		  break;
		case 'P':
		  anEvent = processEvent(eventType, PRI_RATE, 10, "Brian Tracy");
		  break;
		default:
		  anEvent = processEvent(eventType, PRI_RATE, 6, "Robin Armanetti");
		  break;
	}

	
	  System.out.println("Minimum rate charged is $" + anEvent);
      System.out.println("\nEND OF PROGRAM\n");
    }//end of main method
    
    public static double processEvent(char type double rate int hours String presenter)
    {
       double charge = 0.0;
       charge = rate * hours;
       System.out.println("Presenter of the event is "+presenter);
     
    }
}//end of constructor