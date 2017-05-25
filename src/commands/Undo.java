package commands;
import states.States;
import states.Text;

public class Undo extends StatesTextCommand
{

	public Undo(Text text, States states) {
		super(text, states);
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
