import java.awt.Color;
import java.awt.Point;

/**
 * Class representing proteobacteria. Proteobacteria appears black in color in the panel. 
 * Its movement is in a clockwise circle pattern. Initially the proteobacteria faces up.
 */

public class Proteobacteria extends AbstractMicrobe {

	// horizontal and vertical movement variables.
	// 0 representing no movement horizontally
	// -1 representing movement vertically
    private int dx = 0;
    private int dy = -1;

    /**
     * Constructor for a new Proteobacteria with the specified initial position (x, y coords).
     *
     * @param x x-coordinate of the initial position.
     * @param y y-coordinate of the initial position.
     */
    
    public Proteobacteria(int x, int y) {
        super(new Point(x, y), Color.BLACK);
        if (x == 0 || y == 0)
            throw new IllegalArgumentException(
                    "Proteobacteria can't be on the top row or left column initially");
    }

    /**
     * Moves the Proteobacteria by following clockwise direction patterns. 
     * Ex: move up by one -> turn and face left
     * Ex: move left by one -> turn and face down
     * Ex: move down by one -> turn to face right
     * Ex: move right by one -> turn to face up
     */
    @Override
    public void move() {
        pos.translate(dx, dy);
        // (0, -1) -> (-1, 0) -> (0, 1) -> (1, 0)
        int oldDx = dx;
        dx = dy;
        dy = -oldDx;
    }
}
