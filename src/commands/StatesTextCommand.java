package commands;
import states.States;
import states.Text;

public abstract class StatesTextCommand extends TextCommand
{
	
	States states;

	public StatesTextCommand(Text text, States states) {
		super(text);
		this.states = states;
	}
	
	

}
