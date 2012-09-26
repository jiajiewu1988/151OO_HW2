package cs151.hw2.ex4_14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonTester {
	public static void main(String args[]) {
		BtnFrame frame = new BtnFrame();
		JButton rBtn = new JButton("red");
		JButton bBtn = new JButton("Blue");
		JButton gBtn = new JButton("Green");
		
		final CircleIcon icon = new CircleIcon();
		final JLabel iconLabel = new JLabel(icon);
		
		rBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				icon.setColor(Color.RED);
				iconLabel.repaint();
			}
		});
		
		bBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				icon.setColor(Color.BLUE);
				iconLabel.repaint();
			}
		});
		
		gBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				icon.setColor(Color.GREEN);
				iconLabel.repaint();
			}
		});
		
		frame.setLayout(new GridLayout(2,2));
		frame.add(rBtn);
		frame.add(bBtn);
		frame.add(gBtn);
		frame.add(iconLabel);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
