package commands;
import java.util.ArrayList;

import core.Editor;
import states.Text;

public class Copy extends EditorCommand
{

	public Copy(Editor editor){
		super(editor);
	}
	
	public void execute() {
		ArrayList<Character> press = new ArrayList<Character>();
		for(int i = editor.getBeginSelect(); i<editor.getEndSelect(); i++){
			press.add(editor.getText(i));
		}
		editor.setClipboard(press);
		System.out.println("Copy");
	}
	
	public Commands getType()
	{
		return Commands.copy;
	}
}
