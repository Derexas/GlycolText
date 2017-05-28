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
		if (states.getI() < states.getSize() - 1) {
			states.setI(states.getI()+1);
			text.setMememto(states.getState(states.getI()));
			System.out.println("Redo");
		} else
			System.out.println("Can't Undo : no after state");
	}

	@Override
	public Commands getType() {
		return Commands.redo;
	}

}
