package Unique;
import java.util.Scanner;

/**
 * Lab Unique.java: Program accepts input of five numbers, between 10 and 100 inclusive. 
 * Check for 
 */

/**
 * @author Nicholas Christiny
 *
 */
public class Unique {
	Scanner input = new Scanner(System.in); 
	int[] numbers = new int[5]; // create array of size 5
	int entered = 0; // number of entries
	int value = 0;  // placeholder for entered value 

	public void getNumbers() {
		while(entered < numbers.length){
			System.out.print("Enter number: ");
			value = input.nextInt();

			// validate input
			if (value >= 10 && value <= 100){
				Boolean containsNumber = false;

				// check for duplicate number
				for (int i = 0; i < entered; i++){
					if (numbers[i] == value){
						containsNumber = true;
					} 
				}
				if(!containsNumber){
					// enter validated not duplicated value
					numbers[entered] = value;
					entered++;
					// Display current state of array 
					for (int j = 0; j < entered; j++){
						System.out.print(numbers[j] + " ");
					}
					System.out.println();
				} else {
					System.out.println(value + " has already been entered.");
				}

			} else {
				System.out.println("Must enter integer from 10 to 100.");
			}

		}
	}
}