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
		System.out.println("A.\tDisplay the multiples of 3 backward from 33 to 3.\nB.\tDisplay the capital letters of the alphabet backward from Z to A.\nQ.\tExit");
		do {
			System.out.print("\nPlease enter your selection >>> ");
			answer = console.next().toUpperCase();
			if (answer.equals("A") || answer.equals("B")) {
				selection_valid = true;	
				switch(answer){
				case "A":
					for (int i = 33; i >= 3; i--){
						if (i % 3 == 0)
							System.out.print(i + " ");
					}
					selection_valid = false;	
					break;
				case "B":
					for (int i = 90; i >= 65; i-- ){
						char c = (char)i;
						System.out.print(c + " ");
					}
					selection_valid = false;	
					break;
				default:
					System.out.println("Something went wrong");
				}
			}
			else if (answer.equals("Q")) {
				System.out.println("Thank you for using this program.");
				console.close();
				System.exit(0);
			}
			else {
				System.out.println("Choice must be 'A', 'B', or 'Q'");
				System.out.print("Please reenter: ");
			}

		} while (!selection_valid);
	}

}
