class RotateCommand extends Command{
  private double rads;
  public RotateCommand(double rads){
    this.rads = rads;
  }
  public void execute(Editor edit){
    edit.sq.rotate(rads);
  }
  public void undo(Editor edit){
    edit.sq.rotate(-rads);
  }
  public String toString(){
    return "Rotate by "+rads+" radians";
  }

}
