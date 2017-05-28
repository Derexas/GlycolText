package commands;
import states.States;
import states.Text;

public abstract class StatesTextCommand implements Command
{
	protected States states;
	protected Text text;

	public StatesTextCommand(Text text, States states) {
		this.text = text;
		this.states = states;
	}	
	

}
