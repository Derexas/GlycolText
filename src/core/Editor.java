package core;

import java.util.ArrayList;
import java.util.List;

import states.Text;

public class Editor {
	
	private int beginSelect, endSelect;
	private char character;
	private ArrayList<Character> clipboard;
	private Text text;	
	
	public Editor(Text text)
	{
		this.text = text;
		this.clipboard = new ArrayList<Character>();
		this.beginSelect = this.endSelect = 0;
		this.character = 0;
	}
	
	public void addText(List<Character> s, int pos)
	{
		text.getText().addAll(pos, s);
	}
	
	public Character getText(int i){
		return text.getText().get(i);
	}
	
	public void removeText(int posBegin, int posEnd)
	{
		assert posBegin > 0 && posEnd < text.getText().size() && posBegin < posEnd;
		
		for (int i = posBegin; i < posEnd; i++)
			text.getText().remove(posBegin);
	}
	
	public List<Character> getSelection()
	{
		assert this.beginSelect >= 0 && this.endSelect < this.text.getText().size();
		
		List<Character> selection = this.text.getText().subList(this.beginSelect, this.endSelect);
		return selection;
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

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public ArrayList<Character> getClipboard() {
		return clipboard;
	}

	public void setClipboard(ArrayList<Character> clipboard) {
		this.clipboard = clipboard;
	}

}
