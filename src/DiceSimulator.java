import java.util.Random;
import java.util.Scanner;

public class DiceSimulator {
	
	void roll_dice(Scanner intscanner, Scanner strscanner) {
			
		// ask number of dice to use
		System.out.println("How many dice are you using?");
		int dienum = intscanner.nextInt();
		
		// ask if user wants to print out each value of die
		System.out.println("Would you like to print out each value of the dice? (Y/N)");
		String printoption = strscanner.nextLine();
		char printoption1 = printoption.charAt(0);
		
		// initiate dice sum
		int diesum = 0;
		
		// add up dice values
		for(int i=1; i<=dienum; i++) {
			
			// pick random integer between 1 and 6
			Random rand = new Random();
			int rollednum = rand.nextInt(6) + 1;
			
			// add rolled value to total sum
			diesum += rollednum;
			
			// print out individual rolled numbers if printoption1 is Y
			if(printoption1 == 'Y') {
				System.out.println("Roll " + i + ": " + rollednum);
			}
			
		}
		
		// print total value
		System.out.println("Total Dice Value: " + diesum);
		
	}

}
