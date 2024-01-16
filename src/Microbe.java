import java.awt.Color;
import java.awt.Point;

/**
 * Microbe interface that represents different types of microbes.
 * 
 */
public interface Microbe {

	/**
	 * TellS a microbe to move. Each time a microbe is told to move, it will
	   move its position once. 
	 */
    void move();

    /*
     * Get the microbe’s color.
     */
    
    Color getColor();

    /*
     * Get the microbe’s (x,y) position as a Point object.
     */
    Point getPosition();
    
}
