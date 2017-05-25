package states;
import java.util.ArrayList;
import java.util.List;

public class States {

	private List<Memento> states;
	private int i;
	
	public States()
	{
		this.states = new ArrayList<Memento>();
		this.i = 0;
	}
	
	public Memento getState(int index)
	{
		return this.states.get(index);
	}
	
	public void addState(Memento memento)
	{
		this.states.add(memento);
	}
	
	public int getI()
	{
		return i;
	}
	
	public void setI(int newI)
	{
		this.i = newI;
	}

	public int getSize() {
		return this.states.size();
	}

}
