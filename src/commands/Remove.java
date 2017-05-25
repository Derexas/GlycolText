package commands;

import core.Editor;
import states.Text;

public class Remove  extends EditorCommand
{

	public Remove(Editor editor){
		super(editor);
	}
	
	public void execute() {
		editor.removeText(editor.getBeginSelect(), editor.getEndSelect() - editor.getBeginSelect());
		System.out.println("Remove");
	}

	@Override
	public Commands getType() {
		return Commands.remove;
	}
	
}
