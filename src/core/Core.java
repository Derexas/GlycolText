package core;
import commands.*;
import states.States;
import states.Text;

public class Core {
	
	private Editor editor;
	private Text text;
	private Cursor cursor;
	private States states;
	
	private Invoker invoker;
	
	public Core()
	{
		this.text = new Text();
		this.editor = new Editor(this.text);
		this.cursor = new Cursor();
		this.states = new States();
		this.invoker = new Invoker();
		this.createCommands();
	}
	
	private void createCommands()
	{
		invoker.addCommand(Commands.insert, new Insert(editor, cursor));
		invoker.addCommand(Commands.remove, new Remove(editor));
		
		invoker.addCommand(Commands.copy, new Copy(editor));
		invoker.addCommand(Commands.cut, new Cut(editor));
		invoker.addCommand(Commands.paste, new Paste(editor, cursor));
		
		invoker.addCommand(Commands.undo, new Undo(text, states));
		invoker.addCommand(Commands.redo, new Redo(text, states));
		
		invoker.addCommand(Commands.moveCursor, new MoveCursor(cursor));
		
		invoker.addCommand(Commands.macro, new Macro(invoker.getHist()));
	}
	
	public void callCommand(Commands command)
	{
		if (command == Commands.insert) {
			this.editor.setCharacter('a');
		} else if (command == Commands.moveCursor) {
			
		} else if (command == Commands.select) {
			
		}
		invoker.execCommand(command);
	}
	
	public void setCharacter(char c)
	{
		this.editor.setCharacter(c);
	}
	
	public void setCursorMove(int x)
	{
		this.cursor.setX(x);
	}
	
	public void setSelection(int b, int e)
	{
		this.editor.setBeginSelect(b);
		this.editor.setEndSelect(e);
	}
	
}
