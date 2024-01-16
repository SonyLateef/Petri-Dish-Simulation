import java.awt.Color;
import java.awt.Point;

/**
 * AbstractMicrobe is an abstract class that implements the Microbe interface. 
 * This class holds behaviors common to all microbe classes. Such fields include
 * position and color properties.
 */

abstract public class AbstractMicrobe implements Microbe {
	
    // The position and color of the microbe are marked as final, so they cannot be changed after initialization.
    protected final Point pos;
    protected final Color color;
	
	/**
     * Constructor for the specified position and color.
     *
     * @param pos   The position of the microbe represented by a Point object.
     * @param color The color of the microbe represented by a Color object.
     */
    public AbstractMicrobe(Point pos, Color color) {
        this.pos = pos;
        this.color = color;
    }

    /**
     * Gets the color of the microbe.
     *
     * @return The color of the microbe (as a Color object).
     */
    
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Gets the position of the microbe.
     *
     * @return The position of the microbe (as a Point object).
     */
    
    @Override
    public Point getPosition() {
        return pos;
    }

    /**
     * Checks if a microbe has hit the X boundary based on its current position and displacement.
     *
     * @param x  x-coordinate of the microbe's current position.
     * @param dx displacement value by which the microbe is moving.
     * @return   true Returns true if the microbe has hit the X boundary, and false if not.
     */
    
    protected static boolean hitXBoundary(int x, int dx) {
        return (dx < 0 && x == 0) || (dx > 0 && x >= MicrobeConstants.SIZE - 1);
    }
}
