package commands;
import states.States;
import states.Text;

public class Undo implements Command
{	
	private Text text;
	private States states;

	public Undo(Text text, States states) {
		this.text = text;
		this.states = states;
	}

	@Override
	public void execute() {
		if (states.getI() > 0) {
			states.setI(states.getI()-1);
			text.setMememto(states.getState(states.getI()));
			System.out.println("Undo");
		}
	}

	@Override
	public Commands getType() {
		return Commands.undo;
	}

}
