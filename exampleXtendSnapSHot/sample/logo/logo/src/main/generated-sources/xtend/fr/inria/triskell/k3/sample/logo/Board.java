package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.Segment;
import fr.inria.triskell.k3.sample.logo.Turtle;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("all")
public class Board extends JPanel {
  private Turtle turtle;
  
  public Board(final Turtle t) {
    this.turtle = t;
  }
  
  public void paint(final Graphics g) {
    for (final Segment seg : this.turtle.drawings) {
      g.drawLine(((int) seg.begin.x), ((int) seg.begin.y), 
        ((int) seg.end.x), ((int) seg.end.y));
    }
  }
}
