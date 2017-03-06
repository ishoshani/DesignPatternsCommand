abstract class Command{
  abstract void execute(Editor edit);
  abstract void undo(Editor edit);
}
