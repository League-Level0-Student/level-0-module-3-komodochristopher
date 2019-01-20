
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 5th";
		String myBirthday = "December 15th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String birthday = JOptionPane.showInputDialog(null, "what birthday do you want");
		// 3. Print out what the user typed
		if (birthday.equals("mine")) {
			System.out.println(myBirthday);
		} // 4. if user asked for "mom"
		else if (birthday.equals("moms")) {
			System.out.println(momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (birthday.equals("dads")) {
			System.out.println(dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
	// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else { System.out.println("sorry I don't know this birthday" );     
			
		}
	
	}
}
