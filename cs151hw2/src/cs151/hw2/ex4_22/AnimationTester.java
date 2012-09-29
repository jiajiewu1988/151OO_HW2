package cs151.hw2.ex4_22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves, show multiple cars move
   a car shape.
   @author Jiajie wu
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setLayout(new FlowLayout());

      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT);   
      
      final JLabel label = new JLabel(icon);

      frame.add(label);
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
               shape.translate(2, 0, ICON_WIDTH);
               label.repaint();
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
