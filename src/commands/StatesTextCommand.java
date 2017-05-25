package commands;
import core.Text;
import states.States;

public abstract class StatesTextCommand extends TextCommand
{
	
	States states;

	public StatesTextCommand(Text text, States states) {
		super(text);
		this.states = states;
	}
	
	

}
