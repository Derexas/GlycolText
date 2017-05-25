package commands;
import java.util.ArrayList;

import core.Editor;

public class Cut extends EditorCommand{

	public Cut(Editor editor) {
		super(editor);
	}
	
	public void execute() {
		ArrayList<Character> press = new ArrayList<Character>();
		for(int i = editor.getBeginSelect(); i<editor.getEndSelect(); i++){
			press.add(editor.getText(i));
		}
		editor.setClipboard(press);
		editor.removeText(editor.getBeginSelect(), editor.getEndSelect() - editor.getBeginSelect());
	}

	@Override
	public Commands getType() {
		return Commands.cut;
	}

}
