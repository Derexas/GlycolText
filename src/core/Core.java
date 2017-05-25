package core;
import commands.*;
import states.States;
import states.Text;

public class Core {
	
	private Text text;
	private States states;
	
	private Invoker invoker;
	
	public Core()
	{
		this.text = new Text();
		this.states = new States();
		this.invoker = new Invoker();
		this.createCommands();
	}
	
	private void createCommands()
	{
		invoker.addCommand(Commands.insert, new Insert(text));
		invoker.addCommand(Commands.remove, new Remove(text));
		
		invoker.addCommand(Commands.copy, new Copy(text));
		invoker.addCommand(Commands.cut, new Cut(text));
		invoker.addCommand(Commands.paste, new Paste(text));
		
		invoker.addCommand(Commands.undo, new Undo(text, states));
		invoker.addCommand(Commands.redo, new Redo(text, states));
		
		invoker.addCommand(Commands.moveCursor, new MoveCursor(text));
		
		invoker.addCommand(Commands.macro, new Macro(invoker.getHist()));
	}
	
	public void callCommand(Commands command)
	{
		if (command == Commands.insert) {
			this.text.setCharacter('a');
		} else if (command == Commands.moveCursor) {
			
		} else if (command == Commands.select) {
			
		}
		invoker.execCommand(command);
	}
	
	public void setCharacter(char c)
	{
		this.text.setCharacter(c);
	}
	
	public void setCursorMove(int x)
	{
		this.text.setX(x);
	}
	
	public void setSelection(int b, int e)
	{
		this.text.setBeginSelect(b);
		this.text.setEndSelect(e);
	}
	
}
