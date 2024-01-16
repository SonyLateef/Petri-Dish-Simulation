import java.awt.*;

public class PetriDish {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//create a drawing panel
		DrawingPanel panel = new DrawingPanel(PetriDishConstants.SIZE* PetriDishConstants.PIXELS,
				PetriDishConstants.SIZE * PetriDishConstants.PIXELS);
		Graphics g = panel.getGraphics();

		//create several microbes
		Microbe[] microbes = {
				new Bacteroides(7,4), new Bacteroides(3, 8),
				new Firmicutes(2, 9), new Firmicutes(16, 11),
				new Actinobacteria(4, 15), new Actinobacteria(8, 1),
				new Proteobacteria(3, 2), new Proteobacteria(18, 14)
		};

		while (true) {
			// clear screen
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, PetriDishConstants.SIZE* PetriDishConstants.PIXELS,
					PetriDishConstants.SIZE* PetriDishConstants.PIXELS);

			// tell each microbe to fly and redraw the microbe
			//for (microbe microbe: microbes) {
			for (int i=0; i<microbes.length;i++){
				Microbe microbe = microbes[i];
				microbe.move();
				g.setColor(microbe.getColor());
				Point pos = microbe.getPosition();
				g.fillOval((int)pos.getX()* PetriDishConstants.PIXELS, (int) pos.getY()* PetriDishConstants.PIXELS,
						PetriDishConstants.PIXELS, PetriDishConstants.PIXELS);

			}
			panel.sleep(500);
		}
	}
}
