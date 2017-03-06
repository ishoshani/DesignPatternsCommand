import java.util.Stack;
import java.util.EmptyStackException;

class RedoCommand extends MetaCommand{
  Command redid = null;
  public void execute(Editor edit, CommandManager cm){
    if(cm.mostRecentAction!=null){
      redid = cm.mostRecentAction;
      redid.execute(edit);
      cm.undoStack.push(redid);
      if(cm.undoStack.size()>cm.maxUndo){
        cm.undoStack.removeLast();
      }
    }else{
      System.out.println("nothing to redo");
      return;
    }
  }
  public void undo(Editor edit, CommandManager cm){
    redid.undo(edit);
  }
  public String toString(){
    return "Redid "+redid;
  }
}
