public class NOTES_Parse_wSubstring
{
	public static void main (String [] args)
	{
		String name = new String ("James R Habermas");
		//NOTE: Textbook, figure 9.4
		System.out.println(name.substring(8)); //"Habermas"

		System.out.println(name.substring(0, 5)); //"James"

		System.out.println(name.substring(0, 9)); //"James R H"
	}//end main
}//end class