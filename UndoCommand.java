import java.util.Stack;
import java.util.NoSuchElementException;

class UndoCommand extends MetaCommand{
  Command undid = null;
  public void execute(Editor edit, CommandManager cm){
  try{
    undid = cm.undoStack.pop();
  }catch(NoSuchElementException e){
    System.out.println("nothing to undo");
    return;
  }
    undid.undo(edit);
    cm.currentUndo+=1;
  }
  public void undo(Editor edit, CommandManager cm){
    undid.execute(edit);
  }
  public String toString(){
    return "Undid "+undid;
  }
}
