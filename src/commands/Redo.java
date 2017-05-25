package commands;
import states.States;
import states.Text;

public class Redo extends StatesTextCommand
{

	public Redo(Text text, States states) {
		super(text, states);
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