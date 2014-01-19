/*
	Author:	Cameron Gayford
	Date:	2014-01-16
	Course:	CIS 219
	Email:	camgayford@gmail.com
*/


import javax.swing.JOptionPane;

public class WelcomeInMessageDialogBox
{
	//Display Welcome to Java! in a system dialog box.
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(
			null, 				//1st argument.
			"Welcome to Java!",	//2nd argument: the string displayed.
			"Welcome",			//3rd argument: title of the message box.
			JOptionPane.PLAIN_MESSAGE	//4th arg.: information icon.
			);
		System.exit(0); //this closes open windows on termination, which are a security threat.
	}
}
