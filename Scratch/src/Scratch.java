import java.util.Scanner;

public class Scratch {

	private static Scanner console;

	public static void main(String[] args) {
//		console = new Scanner(System.in);
//		int num = console.nextInt();
//
//		if (num > 0){
//			num = num + 13;
//			System.out.println(num);}
//		else
//			if (num >= 3){
//				num = num + 15;
//				System.out.println(num);
//			}
//		System.out.println("End:");
//
//		System.out.println(num);
		
		
		int[] values = {2,6,10,14};
		System.out.println(values[2]);
		System.out.println(++values[0]);
		System.out.println(values[1]++);  //postfix gives 6 to println, the value before increment
		int x = 2;
		System.out.println(values[++x]);

	}

}
