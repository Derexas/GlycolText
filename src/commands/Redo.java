package commands;
import states.States;
import states.Text;

public class Redo implements Command
{
	private Text text;
	private States states;

	public Redo(Text text, States states) {
		this.text = text;
		this.states = states;
	}

	@Override
	public void execute() {
		if (states.getI() < states.getSize()) {
			states.setI(states.getI()+1);
			text.setMememto(states.getState(states.getI()));
			System.out.println("Redo");
		}
	}

	@Override
	public Commands getType() {
		return Commands.redo;
	}

}