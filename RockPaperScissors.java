import java.util.*;

public class RockPaperScissors {	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] arr1 = new String[] {"rock", "paper", "scissors"};
		
		//generate random string for opponent
		Random random = new Random();		
		String randString = arr1[random.nextInt(arr1.length)];
	
		//ask player for their name
		System.out.println("What is your name, player 1? ");
		String play1 = input.next();
		
		
		//ask user for rock, paper, or scissors
		System.out.println(play1 + " would you like to choose rock, paper or scissors?");
		String weapon = input.next();
		
		System.out.println("Opponent chooses " + randString);
		
		
		/*Rules for rock
		 * Rock loses to paper
		 * Rock wins against scissors
		 */
		if(weapon.equals("rock") && randString.equals("paper")) {
			System.out.println("Opponent wins!");
		}
		
		if(randString.equals("rock") && weapon.equals("paper")) {
			System.out.println(play1 + " wins!");
		}
		
		/*		Rules for paper
		 * Paper loses to scissors
		 * Paper wins against rock*/
		 
		if(weapon.equals("paper") && randString.equals("scissors")) {
			System.out.println("Opponent wins!");
		}
		
		if(randString.equals("paper") && weapon.equals("scissors")) {
			System.out.println(play1 + " wins!");
		}
		
		/*Rules for scissors
		 * Scissors loses to rock
		 * Scissors win against paper*/
		 
		if(weapon.equals("scissors") && randString.equals("rock")) {
			System.out.println("Opponent wins!");
		}
		
		if(randString.equals("scissors") && weapon.equals("rock")) {
			System.out.println(play1 + " wins!"); 
		}
		
		//tie
		if(weapon.equals(randString)) {
			System.out.println("It's a tie!");
		}
		
	}
	
}
