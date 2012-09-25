package cs151.hw2.ex4_10;

import java.awt.geom.Rectangle2D;
import java.util.Comparator;

/*
 * Comparator to compare 2 Rectangle2D.Double objects by x, y, width, and height
 */
public class RectangleComparator implements Comparator<Rectangle2D.Double>{
	
	/*
	 * Compare 2 Rectangle2D.Double objects
	 * @param r1 rectangle to compare
	 * @param r2 another rectangle to compare
	 * @return 1 if r1 > r2, 0 if r1 = r2, -1 if r1 < r2
	 */
	@Override
	public int compare(Rectangle2D.Double r1, Rectangle2D.Double r2) {
		if (r1.getX() != r2.getX()) {
			if (r1.getX() > r2.getX()) return 1;
			else return -1;
		} else if (r1.getY() != r2.getY()) {
			if (r1.getY() > r2.getY()) return 1;
			else return -1;
		} else if (r1.getWidth() != r2.getWidth()) {
			if (r1.getWidth() > r2.getWidth()) return 1;
			else return -1;
		} else if (r1.getHeight() != r2.getHeight()) {
			if (r1.getHeight() > r2.getHeight()) return 1;
			else return -1;
		}
		return 0;
	}
}
