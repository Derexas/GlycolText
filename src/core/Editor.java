package core;

import java.util.ArrayList;
import java.util.List;

import states.Text;

public class Editor {
	
	private int beginSelect, endSelect;
	private ArrayList<Character> printBuffer, clipboard;
	private Text text;
	private Cursor cursor;
	
	public Editor(Text text, Cursor cursor)
	{
		this.text = text;
		this.cursor = cursor;
		this.clipboard = new ArrayList<Character>();
		this.printBuffer = new ArrayList<Character>();
		this.unselect();
	}
	
	public void addText(List<Character> s, int pos)
	{
		text.getText().addAll(pos, s);
		this.cursor.addToMax(s.size());
		this.cursor.setCursorPos(this.cursor.getCursorPos()+s.size());
		this.text.setGotNewState(true);
	}
	
	public Character getText(int i){
		return text.getText().get(i);
	}
	
	public void removeText(int posBegin, int posEnd)
	{
		assert posBegin > 0 && posEnd < text.getText().size() && posBegin < posEnd;
		
		if (this.cursor.getCursorPos() > posEnd)
			cursor.setCursorPos(cursor.getCursorPos() - (posEnd - posBegin));
		else if (this.cursor.getCursorPos() > posBegin)
			cursor.setCursorPos(posBegin);
		
		for (int i = posBegin; i < posEnd; i++)
			text.getText().remove(posBegin);
		
		this.cursor.addToMax(-(posEnd - posBegin));
		this.text.setGotNewState(true);
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

	public ArrayList<Character> getPrintBuffer() {
		return this.printBuffer;
	}

	public void setPrintBuffer(ArrayList<Character> printBuffer) {
		this.printBuffer.clear();
		this.printBuffer.addAll(printBuffer);
	}

	public void setPrintBuffer(char c) {
		this.printBuffer.clear();
		this.printBuffer.add(c);
	}

	public ArrayList<Character> getClipboard() {
		return clipboard;
	}

	public void setClipboard(ArrayList<Character> clipboard) {
		this.clipboard = clipboard;
	}
	
	public boolean selectionExist() {
		return !(this.beginSelect == 0 && this.endSelect == 0);
	}
	
	public void unselect() {
		this.beginSelect = this.endSelect = 0;
	}

}
