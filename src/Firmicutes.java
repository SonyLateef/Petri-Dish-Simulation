import java.awt.Color;
import java.awt.Point;
import java.util.Random;

/**
 * Class representing the firmicute bacteria. This bacteria
 * is represented as white dots on the panel and it's movement is random.
 * 
 */

public class Firmicutes extends AbstractMicrobe {

    // Random object used to generate the random positions for movement.
    private final Random random = new Random();

	
	/**
     * Constructor for a new Firmicute with the specified initial position (x, y).
     *
     * @param x x-coordinate of the initial position.
     * @param y y-coordinate of the initial position.
     */
	
    public Firmicutes(int x, int y) {
        super(new Point(x, y), Color.WHITE);
    }

    /**
     * Moves the Firmicutes by updating its position to a random location within the valid bounds (0,0) to (19,19). 
     * The microbe's position is set to a random Point object with X and Y values limited by MicrobeConstants.SIZE.
     */
    
    @Override
    public void move() {
        pos.setLocation(random.nextInt(MicrobeConstants.SIZE),
                random.nextInt(MicrobeConstants.SIZE));
    }

}
