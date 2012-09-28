package cs151.hw2.ex4_20;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);
      
      final MoveableShape shape2
      = new CarShape(0, 0, CAR_WIDTH);
      
      ShapeIcon icon2 = new ShapeIcon(shape2,
              ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      final JLabel label2 = new JLabel(icon2);
      frame.setLayout(new GridLayout(2, 1));
      frame.add(label);
      frame.add(label2);

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
               shape.translate(1, 0);
               shape2.translate(2, 0);
               label.repaint();
               label2.repaint();
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
