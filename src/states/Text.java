package states;
import java.util.ArrayList;
import java.util.List;

public class Text implements Originator {

	private ArrayList<Character> state;
	private boolean gotNewState;
	
	public Text()
	{
		super();
		this.state = new ArrayList<Character>();
		this.setGotNewState(false);
	}

	@Override
	public void setMememto(Memento m) {
		state = new ArrayList<Character>(m.getState());
	}

	@Override
	public Memento getMemento() {
		return new Memento(this.state);
	}
	
	public ArrayList<Character> getText() {
		return this.state;
	}

	public boolean hasGottenNewState() {
		return gotNewState;
	}

	public void setGotNewState(boolean gotNewState) {
		this.gotNewState = gotNewState;
	}

}
