package commands;

import core.Cursor;
import core.Editor;
import states.Text;

public class Remove extends CursorEditorCommand
{

	public Remove(Editor editor, Cursor cursor){
		super(editor, cursor);
	}
	
	public void execute() {
		if (!this.editor.selectionExist())
			editor.removeText(this.cursor.getCursorPos()-1, this.cursor.getCursorPos());
		else
			editor.removeText(editor.getBeginSelect(), editor.getEndSelect());
		System.out.println("Remove");
	}

	@Override
	public Commands getType() {
		return Commands.remove;
	}
	
}
