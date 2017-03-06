abstract class MetaCommand extends Command{
  public void execute(Editor edit){
    return;
  }
  public void undo(Editor edit){
    return;
  }
  abstract void execute(Editor edit, CommandManager cm);
  abstract void undo(Editor edit, CommandManager cm);
}
