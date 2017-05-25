package core;
import commands.*;
import states.States;

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
		invoker.addCommand(Commands.insert, new Insert(text, 'a'));
		invoker.addCommand(Commands.remove, new Remove(text));
		
		invoker.addCommand(Commands.copy, new Copy(text));
		invoker.addCommand(Commands.cut, new Cut(text));
		invoker.addCommand(Commands.paste, new Paste(text));
		
		invoker.addCommand(Commands.undo, new Undo(text, states));
		invoker.addCommand(Commands.redo, new Redo(text, states));
		
		invoker.addCommand(Commands.moveCursor, new Copy(text));
	}
	
	public void callCommand(Commands command)
	{
		invoker.execCommand(command);
	}
	
}
