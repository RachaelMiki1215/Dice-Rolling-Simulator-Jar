import java.util.Scanner;

public class RunDiceSimulator {
	
	public static void main(String[] args) {
		
		Scanner intscan = new Scanner(System.in);		
		Scanner strscan = new Scanner(System.in);
		
		// initiate variable asking to roll
		char continueroll = 'Y';
		
		// roll while user asks
		while(continueroll == 'Y') {
			
			// call DiceSimulator class
			DiceSimulator letsroll = new DiceSimulator();
			letsroll.roll_dice(intscan, strscan);
			
			// ask if user wants to roll again
			System.out.println("Do you want to roll again? (Y/N)");
			String asked_answer = strscan.nextLine();
			continueroll = asked_answer.charAt(0);
			
		}
		
		// say Goodbye if user quits
		if (continueroll == 'N') {
			System.out.println("Goodbye!!!");
			intscan.close();
			strscan.close();
		}
		
	}
	
}
