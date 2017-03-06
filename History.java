import java.util.Stack;

class History extends MetaCommand{

  public void execute(Editor edit, CommandManager cm){
    Object[] historyArray = cm.history.toArray();
    for (int i = 1; (i<=cm.maxHistory)&&(i<=historyArray.length) ;i++){
      System.out.println(historyArray[historyArray.length-i]);
    }
  }
  public void undo(Editor edit, CommandManager cm){
    return;
  }
  public String toString(){
    return "History";
  }
}
