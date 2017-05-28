package commands;

import core.Cursor;
import core.Editor;

public class Insert extends CursorEditorCommand
{
	
	public Insert(Editor editor, Cursor cursor) {
		super(editor, cursor);
	}

	public void execute() {
		int pastePosition = this.cursor.getCursorPos();
		if (this.editor.selectionExist()) {
			System.out.println("Insert : remove selection");
			this.editor.removeText(
					this.editor.getBeginSelect(), this.editor.getEndSelect());
			pastePosition = this.editor.getBeginSelect();
		}
		editor.addText(editor.getPrintBuffer(), pastePosition);
		this.editor.unselect();
		System.out.println("Insert : " + editor.getPrintBuffer().get(0));
	}

	@Override
	public Commands getType() {
		return Commands.insert;
	}

}
