package cs151.hw2.ex4_18;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.*;


public class ClockIcon implements Icon{
	
	final double HOUR_HAND_LENGTH = 60.0;
	final double MIN_HAND_LENGTH = 120.0;
	final double SEC_HAND_LENGTH = 125.0;
	
	private double hour;
	private double min;
	private double sec;
	
	/**
	 * Constructs the clock icon
	 * @param inHour initialize the clock hour
	 * @param inMin initialize the clock minute
	 * @param inSec initialize the clock second
	 */
	public ClockIcon(String currentTime) {
		String[] time = currentTime.split(":");
		hour = Double.parseDouble(time[0]);
		min = Double.parseDouble(time[1]);
		sec = Double.parseDouble(time[2]);
	}
	
	/**
	 * Paint the clock
	 * @param c a component
	 * @param g graphic object
	 * @param x 
	 * @param y
	 */
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(250, 250, 400, 400);
		g2.draw(circle);
		
		Line2D.Double hHand = new Line2D.Double(
				250, 250, 250 + HOUR_HAND_LENGTH * Math.sin(Math.PI * (double) hour / 6), 250 - HOUR_HAND_LENGTH * Math.cos(Math.PI * (double) hour / 6)
				);
		Line2D.Double mHand = new Line2D.Double(
				250, 250, 250 + MIN_HAND_LENGTH * Math.sin(Math.PI * (double) min / 30), 250 - MIN_HAND_LENGTH * Math.cos(Math.PI * (double) min / 30)
				);
		Line2D.Double sHand = new Line2D.Double(
				250, 250, 250 + SEC_HAND_LENGTH * Math.sin(Math.PI * (double) sec / 30), 250 - SEC_HAND_LENGTH * Math.cos(Math.PI * (double) sec / 30)
				);
		g2.draw(hHand);
		g2.draw(mHand);
		g2.draw(sHand);
	}
	
	/**
	 * Parse the time to integer format
	 * @param currentTime current time
	 */
	public void parseTime(String currentTime) {
		String[] time = currentTime.split(":");
		hour = Double.parseDouble(time[0]);
		min = Double.parseDouble(time[1]);
		sec = Double.parseDouble(time[2]);
	}
	
	/**
	 * Get the width of the icon
	 * @return 0
	 */
	public int getIconWidth() {
		return 0;
	}
	
	/**
	 * Set the fill color of the circle
	 * @param cl color to fill the circle
	 */
	public int getIconHeight() {
		return 0;
	}
}
