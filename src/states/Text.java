package states;
import java.util.ArrayList;
import java.util.List;

public class Text implements Originator {

	private ArrayList<Character> state;
	
	public Text()
	{
		super();
		this.state = new ArrayList<Character>();
	}

	@Override
	public void setMememto(Memento m) {
		state = m.getState();
	}

	@Override
	public Memento getMemento() {
		return new Memento(this.state);
	}
	
	public ArrayList<Character> getText() {
		return this.state;
	}

}
