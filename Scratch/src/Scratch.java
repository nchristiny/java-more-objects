import java.util.Scanner;

public class Scratch {

//	private static Scanner console;

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
		
//		int[] values = {2,6,10,14};
//		System.out.println(values[2]);
//		System.out.println(++values[0]);
//		System.out.println(values[1]++);  //postfix gives 6 to println, the value before increment
//		int x = 2;
//		System.out.println(values[++x]);

////////////////////////////////////////		
//		int[] alpha = new int[5];

//		for (int j = 0; j < 5; j++)
//		{
//		   alpha[j] = 2 * j;
//
//		   if (j % 2 == 1)
//		      alpha[j - 1] = alpha[j] + j;
//		}
//		
//		for (int i : alpha)
//			System.out.println(i);
		// #=> 3 2 9 6 8
////////////////////////////////////////
//		int[] alpha = new int[5];
//
//		for (int j = 0; j < 5; j++)
//		    alpha[j] = 2 * j - 1;
//		
//		for (int i = 0; i < 5; i++)
//			System.out.println(alpha[i]);

///////////////////////////////////
//		// Fun with hierarchy chain of inheritance 
//		Scratch test = new Scratch();
//		DClass dObject = test.new DClass();
//		dObject.print();
//		dObject.printSuper();
	}
	
//	public class BClass
//	{
//	    public int x = 1;
//	    private double y = 2;
//
//	    public void print() 
//	    { 
//	    	System.out.println(this.x);
//	    	System.out.println(this.y);  
//
//	    }
//	}
//
//	public class DClass extends BClass
//	{
//	    private int a = 3;
//	    private int b = 4;
//	    
//	    @Override
//	    public void print() 
//	    { 
//	    	System.out.println(this.a);
//	    	System.out.println(this.b);
//	    	System.out.println(this.x);
//	    	// System.out.println(this.y); // y is private #=> Compilation error "The field Scratch.BClass.y is not visible"
//	    }
//	    public void printSuper() 
//	    { 
//	    	System.out.println(super.x);
//	    	System.out.println(super.y); // call to super works
//
//	    }
//	}
	
}
