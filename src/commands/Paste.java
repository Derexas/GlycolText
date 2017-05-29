package commands;
import core.Cursor;
import core.Editor;

public class Paste extends Insert
{

	public Paste(Editor editor, Cursor cursor) {
		super(editor, cursor);
	}

	@Override
	public void execute() {
		System.out.println(editor.getBeginSelect()+" "+editor.getEndSelect());
		if (this.editor.getClipboard().size() > 0) {
			this.editor.setPrintBuffer(this.editor.getClipboard());
			System.out.println("Paste : "+this.editor.getClipboard().toString());
			super.execute();
			System.out.println("Paste");
		} else
			System.out.println("Can't Paste : clipboard empty");
	}

	@Override
	public Commands getType() {
		return Commands.paste;
	}
	
}
