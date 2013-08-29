package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.Board;
import fr.inria.triskell.k3.sample.logo.Turtle;
import javax.swing.JFrame;

@SuppressWarnings("all")
public class Window {
  private JFrame frame;
  
  public Window(final Turtle t) {
    JFrame _jFrame = new JFrame();
    this.frame = _jFrame;
    this.frame.setBounds(100, 100, 500, 500);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setTitle("Logo example");
    this.frame.setVisible(true);
    Board _board = new Board(t);
    this.frame.add(_board);
  }
}
