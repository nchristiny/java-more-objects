/**
 * Code to test TrafficLight.java and Enum type practice 
 */
package traffic;

/**
 * @author Nicholas Christiny
 *
 */
public class EnumTest {

	public static void main(String[] args) {
		// Display header of Light and Duration
		System.out.println("Light\tDuration");
		
		// print all traffic lights and their duration using enhanced for loop
		for(TrafficLight color : TrafficLight.values()) {
			System.out.println(color + "\t" + color.getSeconds());
		}
	}

}
