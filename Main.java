import java.awt.*;

public class Main extends java.applet.Applet implements Runnable{
  private Command[] commands = {new TranslateCommand(40,40),new TranslateCommand(30,30), new UndoCommand(),
    new ColorCommand(Color.blue),new RotateCommand(0.5), new UndoCommand(), new UndoCommand(),  new RedoCommand(),  new RedoCommand(), new History()};
  private Editor editor = new Editor();
  private CommandManager cm = new CommandManager(editor,99,1);
  private Thread thread;
  public Main(){
    super();
  }
  public void init(){
    add(editor);
    thread = new Thread(this);
    thread.start();
  }
  public void run(){
    for (int i = 0; i < commands.length; i++) {
      cm.execute(commands[i]);
      try { thread.sleep (2500); }
      catch (InterruptedException ok) {}
      }
    }
  }
