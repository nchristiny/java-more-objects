/**
 * Enum type practice 
 */
package traffic;

/**
 * @author Nicholas Christiny
 *
 */
public enum TrafficLight {
	// Declare constants of enum type
	RED(50), GREEN(40),YELLOW(5);
	
	// Instance fields (Durations of the light)
	int seconds;
	
	// enum type constructor
	TrafficLight(int seconds){
		this.seconds = seconds;
	}
	
	// accessor for duration
	int getSeconds(){
		return seconds;
	}
	
}
