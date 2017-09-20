import java.util.Scanner;

/**
 * Program 2: Switch/For loop  Review
 * Display a menu and execute different actions.
 */

/**
 * @author Nicholas Christiny
 *
 */

public class MenuList {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		Boolean selection_valid = false;
		String answer;
		System.out.print("Please enter your selection >>> ");
		do {
			answer = console.next().toUpperCase();
			if (answer.equals("A") || answer.equals("B")  || answer.equals("Q"))
				selection_valid = true;	
			else {
				System.out.println("Choice must be 'A', 'B', or 'Q'");
				System.out.print("Please reenter: ");
			}
		} while (!selection_valid);

		switch(answer){
		case "A":
			for (int i = 0; i <= 33; i += 3){
				System.out.print(33 - i + " ");
			}
			break;
		case "B":
			for (int i = 25; i >= 0; i-- ){
				String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				System.out.print(alphabet.charAt(i) + " ");
			}
			break;
		case "Q":
			System.out.println("Thank you for using this program.");
			System.exit(0);
		default:
			System.out.println("Something went wrong");
		}
		console.close();
	}

}
