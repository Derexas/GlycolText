package commands;
import java.util.ArrayList;
import java.util.List;

import core.Cursor;
import core.Editor;
import states.Text;

public class Insert extends CursorEditorCommand
{
	
	public Insert(Editor editor, Cursor cursor) {
		super(editor, cursor);
	}

	public void execute() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add(editor.getCharacter());
		editor.addText(list, cursor.getCursorPos());
		System.out.println("Insert");
	}

	@Override
	public Commands getType() {
		return Commands.insert;
	}

}
