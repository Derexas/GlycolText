import java.util.ArrayList;
import java.util.List;

public class Text implements Originator {	

	private ArrayList<Character> state;
	
	private int cursorPos, beginSelect, endSelect;
	
	public Text()
	{
		super();
		this.state = new ArrayList<Character>();
		this.cursorPos = this.beginSelect = this.endSelect = 0;
	}

	@Override
	public void setMememto(Memento m) {
		state = m.getState();
	}

	@Override
	public Memento getMemento() {
		return new Memento(this.state);
	}
	
	public void addText(List<Character> s, int pos)
	{
		state.addAll(pos, s);
	}
	
	public void removeText(int pos, int removalSize)
	{
		assert pos+removalSize < state.size();
		
		for (int i = 0; i < removalSize; i++)
			state.remove(pos);
	}
	
	public List<Character>  getSelection()
	{
		assert this.beginSelect >= 0 && this.endSelect < this.state.size();
		
		List<Character> selection = this.state.subList(this.beginSelect, this.endSelect);
		return selection;
	}

	public int getCursorPos() {
		return cursorPos;
	}

	public void setCursorPos(int cursorPos) {
		this.cursorPos = cursorPos;
	}

	public int getBeginSelect() {
		return beginSelect;
	}

	public int setBeginSelect(int beginSelect) {
		this.beginSelect = beginSelect;
		return beginSelect;
	}

	public int getEndSelect() {
		return endSelect;
	}

	public int setEndSelect(int endSelect) {
		this.endSelect = endSelect;
		return endSelect;
	}

}
