package commands;
import core.Cursor;
import core.Editor;

public class Paste extends CursorEditorCommand
{

	public Paste(Editor editor, Cursor cursor) {
		super(editor, cursor);
	}

	@Override
	public void execute() {
		this.editor.addText(this.editor.getSelection(), this.cursor.getCursorPos());
		System.out.println("Paste");
	}

	@Override
	public Commands getType() {
		return Commands.paste;
	}
	
}
