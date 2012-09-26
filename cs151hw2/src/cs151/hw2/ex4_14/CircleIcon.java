package cs151.hw2.ex4_14;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;

public class CircleIcon implements Icon{
	
	private Color fillColor;
	
	public CircleIcon() {
		fillColor = Color.RED;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 150, 150);
		g2.draw(circle);
		g2.setColor(fillColor);
		g2.fill(circle);
	}

	@Override
	public int getIconWidth() {
		return 0;
	}

	@Override
	public int getIconHeight() {
		return 0;
	}
	
	public void setColor(Color cl) {
		fillColor = cl;
	}

}
