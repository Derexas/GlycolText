package commands;

import core.Editor;

public class Cut extends Copy
{

	public Cut(Editor editor) {
		super(editor);
	}
	
	public void execute() {
		if (this.editor.selectionExist()) {
			super.execute();
			editor.removeText(editor.getBeginSelect(), editor.getEndSelect());
			editor.unselect();
		} else
			System.out.println("Can't Paste : clipboard empty");
	}

	@Override
	public Commands getType() {
		return Commands.cut;
	}

}
