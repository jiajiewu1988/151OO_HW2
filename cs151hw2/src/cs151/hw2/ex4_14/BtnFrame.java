package cs151.hw2.ex4_14;

import javax.swing.JFrame;

/**
 * Create a JFrame window
 * @author Jiajie Wu
 */
@SuppressWarnings("serial")
public class BtnFrame extends JFrame {
	
	private final int DEFAULT_WIDTH = 500;
	private final int DEFAULT_HEIGHT = 500;
	
	/**
	 * Constructs a frame
	 */
	public BtnFrame() {
		setTitle("Exercise 4.12 - Jiajie Wu");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
