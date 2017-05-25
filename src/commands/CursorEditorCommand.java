package commands;

import core.Cursor;
import core.Editor;

public abstract class CursorEditorCommand extends EditorCommand
{
	protected Cursor cursor;

	public CursorEditorCommand(Editor editor, Cursor cursor) {
		super(editor);
		this.cursor = cursor;
	}

}
