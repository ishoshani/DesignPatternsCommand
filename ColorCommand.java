  import java.awt.*;
class ColorCommand extends Command{
  private Color color;
  private Color oldColor;
  public ColorCommand(Color color){
    this.color = color;
    this.oldColor = Color.black;
  }
  public void execute(Editor edit){
    oldColor = edit.sq.getColor();
    edit.sq.setColor(color);
  }
  public void undo(Editor edit){
    edit.sq.setColor(oldColor);
  }
  public String toString(){
    return "set color to "+color;
  }
}
