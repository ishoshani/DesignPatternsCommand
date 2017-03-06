import java.util.Stack;
import java.util.LinkedList;
class CommandManager{
  private Editor edit;
  public int maxHistory;
  public int maxUndo;
  public int currentUndo;
  public Command mostRecentAction;
  public Stack<Command> history = new Stack<Command>();
  public LinkedList<Command> undoStack = new LinkedList<Command>();
  public CommandManager(Editor editor, int maxHistory, int maxUndo){
    this.maxHistory= maxHistory;
    this.maxUndo = maxUndo;
    this.currentUndo = 0;
    edit = editor;

  }
  public void execute(Command nextCommand){
    if(nextCommand instanceof MetaCommand){
      MetaCommand MetaNext = (MetaCommand)nextCommand;
      MetaNext.execute(edit,this);
    }else{
    currentUndo=0;
    nextCommand.execute(edit);
    undoStack.push(nextCommand);
    mostRecentAction = nextCommand;
    if(undoStack.size()>maxUndo){
      undoStack.removeLast();
    }
    }
    history.push(nextCommand);
    edit.repaint();
  }
}
