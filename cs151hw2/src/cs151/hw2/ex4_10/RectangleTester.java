package cs151.hw2.ex4_10;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Test the RectangleComparator.java
 */
public class RectangleTester {
	/**
	 * print the the x, y, width, and heigt of a rectangle
	 * @param rec rectangle to display
	 */
	public static void display(Rectangle2D.Double rec) {
		System.out.println("(" + rec.getX() + ", " + rec.getY() + ", " + rec.getWidth() + ", " + rec.getHeight() + ")");
	}
	
	public static void main(String args[]) {
		ArrayList<Rectangle2D.Double> recArray = new ArrayList<Rectangle2D.Double>();
		RectangleComparator c = new RectangleComparator();
		
		recArray.add(new Rectangle2D.Double(10, 20, 30, 40));
		recArray.add(new Rectangle2D.Double(10, 30, 20, 40));
		recArray.add(new Rectangle2D.Double(20, 20, 30, 40));
		recArray.add(new Rectangle2D.Double(10, 20, 20, 40));
		
		System.out.println("The original array order is: ");
		for (Rectangle2D.Double r : recArray) {
			display(r);
		}
		System.out.println("\nThe order after sorting is: ");
		
		Collections.sort(recArray, c);
		for (Rectangle2D.Double r : recArray) {
			display(r);
		}
	}

}
