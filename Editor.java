import java.awt.*;
public class Editor extends Panel {
  private static final Dimension dim = new Dimension(300,300);
  public Square sq = new Square();
  public Dimension getPreferredSize () { return dim; }
  public void paint(Graphics g){ sq.paint(g);}
}
