import java.util.Scanner;

public class Scratch {

	private static Scanner console;

	public static void main(String[] args) {
		console = new Scanner(System.in);
		int num = console.nextInt();

		if (num > 0){
			num = num + 13;
			System.out.println(num);}
		else
			if (num >= 3){
				num = num + 15;
				System.out.println(num);
			}
		System.out.println("End:");

		System.out.println(num);
		
	}

}
