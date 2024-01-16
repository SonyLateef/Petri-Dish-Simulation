import java.awt.Color;
import java.awt.Point;

/**
 * Class representing bacteroide bacteria. This bacteria is marked with red dye in the panel.
 * It extends the AbstractMicrobe class and implements a method for it's movement.
 */

class Bacteroides extends AbstractMicrobe {
	
    // The direction, -1 for moving left, +1 for moving right.
    private int dx = -1;

    /**
     * Constructs a new Bacteroides with the specified initial position (x, y).
     *
     * @param x x-coordinate of the initial position.
     * @param y y-coordinate of the initial position.
     */
    
    public Bacteroides(int x, int y) {
        super(new Point(x, y), Color.RED);
    }

    /**
     * Moves the bacteroide bacteria by updating its position
     * If the bacteroide hits the X boundary, its horizontal direction is reversed.
     * Bacteroide's movement is horizontal so the x coordinate is focused on
     */
    
    @Override
    public void move() {
        if (hitXBoundary(pos.x, dx)) {
            dx = -dx;
        }
        pos.translate(dx, 0);
    }


}
