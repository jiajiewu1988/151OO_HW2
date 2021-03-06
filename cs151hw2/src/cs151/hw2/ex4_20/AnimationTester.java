package cs151.hw2.ex4_20;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;

/**
   This program implements an animation that moves, show multiple cars move
   a car shape.
   @author Jiajie Wu
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setLayout(new GridLayout(3, 1));

      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);
      
      ArrayList<ShapeIcon> iconList = new ArrayList<ShapeIcon>();
      
      iconList.add(new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT));
      iconList.add(new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT));
      iconList.add(new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT));

      final ArrayList<JLabel> labelList = new ArrayList<JLabel>();
      for (int i = 0; i < iconList.size(); i++) {
    	  labelList.add(new JLabel(iconList.get(i)));
    	  frame.add(labelList.get(i));
      }
      
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               shape.translate(3, 0);
               for (JLabel l : labelList) {
            	   l.repaint();
               }
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
