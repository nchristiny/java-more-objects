/* File Q001_10.java
 * Java Self-Assessment 
 * 
 */

public class Q001_10 {

	public static void main(String[] args) {
		AClass ref1 = new AClass(5);
		AClass ref2 = new AClass(10);
		System.out.println(
				ref1.add(ref2));
	}
}

class AClass{
	private int x;

	AClass(int x){
		this.x = x;
	}

	int add(AClass ref){
		return x + ref.x; // expect output => 15
	}

}

