import java.util.ArrayList;

public class Text implements Originator {	

	private ArrayList<Character> state;
	
	private int cursorPos;
	
	public Text()
	{
		super();
		state = new ArrayList<Character>();
	}
	
	public void addText(String s, int pos)
	{
		for (char c : s.toCharArray()) {
			state.add(pos, c);
			pos++;
		}
	}
	
	public void removeText(int pos, int removalSize)
	{
		assert pos+removalSize < state.size();
		
		for (int i = 0; i < removalSize; i++)
			state.remove(pos);
	}

	@Override
	public void setMememto(Memento m) {
		state = m.getState();
	}

	@Override
	public Memento getMemento() {
		return new Memento(this.state);
	}

	public int getCursorPos() {
		return cursorPos;
	}

	public void setCursorPos(int cursorPos) {
		this.cursorPos = cursorPos;
	}

}
