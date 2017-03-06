class TranslateCommand extends Command{
  private int x;
  private int y;
  public TranslateCommand(int x, int y){
    this.x = x;
    this.y = y;
  }
  public void execute(Editor edit){
    edit.sq.translate(x,y);
  }
  public void undo(Editor edit){
    edit.sq.translate(-x,-y);
  }
  public String toString(){
    return "Translate be x "+x+" and y "+y;
  }
}
