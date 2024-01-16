import java.awt.Color;
import java.awt.Point;

/**
 * Class that represents Actinobacteria.
 * Actinobacteria will be marked with yellow dye in your Petri dish. Its movement is in a zig-zag pattern.
 * 
 */
public class Actinobacteria extends AbstractMicrobe {

    // Private fields to control the horizontal and vertical movement direction. Initially they face left.
    private int dx = -1;
    private int dy = -1;

    /**
     * Constructs a new Actinobacteria with the specified initial position (x, y coords).
     *
     * @param x x-coordinate of the initial position.
     * @param y y-coordinate of the initial position.
     */
    
    public Actinobacteria(int x, int y) {
        super(new Point(x, y), Color.YELLOW);
        if (y == 0)
            throw new IllegalArgumentException("Actinobacteria can't be on the top row initially");
    }

    /**
     * Moves the actinobacteria by updating its position
     * If the microbe hits the X boundary, its horizontal direction is reversed.
     * After each move, the microbe also changes its vertical direction.
     */
    
    @Override
    public void move() {
        if (hitXBoundary(pos.x, dx)) {
            dx = -dx;
        }
        pos.translate(dx, dy);
        dy = -dy;
    }
}
