package core;

import commands.*;
import gui.GUI;
import states.States;
import states.Text;

public class Core {
	
	private Editor editor;
	private Text text;
	private Cursor cursor;
	private States states;
	
	private Invoker invoker;
	
	private GUI gui;
	
	public Core()
	{
		this.text = new Text();
		this.cursor = new Cursor();
		this.editor = new Editor(this.text, this.cursor);
		this.states = new States();
		this.states.addState(this.text.getMemento());
		this.invoker = new Invoker();
		this.createCommands();
	}
	
	private void createCommands()
	{
		invoker.addCommand(Commands.insert, new Insert(editor, cursor));
		invoker.addCommand(Commands.remove, new Remove(editor, cursor));
		
		invoker.addCommand(Commands.copy, new Copy(editor));
		invoker.addCommand(Commands.cut, new Cut(editor));
		invoker.addCommand(Commands.paste, new Paste(editor, cursor));
		
		invoker.addCommand(Commands.undo, new Undo(text, states));
		invoker.addCommand(Commands.redo, new Redo(text, states));
		
		invoker.addCommand(Commands.moveCursor, new MoveCursor(cursor));
		
		Macro macro = new Macro();
		invoker.addCommand(Commands.launchmacro, macro);
		
		invoker.addCommand(Commands.select, new Select(cursor, invoker.getHist()));
	}
	
	public void callCommand(Commands command)
	{
		invoker.execCommand(command);
		
		if (this.text.hasGottenNewState()) {
			
			this.states.addState(this.text.getMemento());
			this.states.setI(this.states.getI()+1);
			this.text.setGotNewState(false);
		}
		
		// Quickfix :(
		if (this.cursor.getCursorPos() > this.text.getText().size())
			this.cursor.setCursorPos(this.text.getText().size());
		// --------
		
		gui.setText(this.text.getText(), this.cursor.getCursorPos());
	}
	
	public void setCharacter(char c)
	{
		this.editor.setPrintBuffer(c);
	}
	
	public void setCursorMove(int x)
	{
		this.cursor.setX(x);
	}
	
	public void setSelection(int b, int e)
	{
		this.editor.setBeginSelect(b);
		this.editor.setEndSelect(e);
	}
	
	public void setGUI(GUI gui)
	{
		this.gui = gui;
	}
	
}
