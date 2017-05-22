import java.util.ArrayList;

public class Memento {	

	private ArrayList<Character> state;
	
	public Memento()
	{
		this.state = new ArrayList<Character>();
	}
	
	public Memento(ArrayList<Character> state)
	{
		this();
	    for (Character c : state)
	    	this.state.add(c);
	}
	
	public ArrayList<Character> getState()
	{
		return state;
	}

}
