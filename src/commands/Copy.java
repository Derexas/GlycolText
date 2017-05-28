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
		if (this.editor.selectionExist()) {
			ArrayList<Character> press = new ArrayList<Character>();
			for(int i = editor.getBeginSelect(); i<editor.getEndSelect(); i++){
				press.add(editor.getText(i));
			}
			editor.setClipboard(press);
			System.out.println("Copy");
		} else
			System.out.println("Can't Copy : no selection");
			
	}
	
	public Commands getType()
	{
		return Commands.copy;
	}
}
