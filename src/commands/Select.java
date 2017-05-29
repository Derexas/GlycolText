package commands;

import java.util.List;

import core.Cursor;
import core.Editor;

public class Select	 extends EditorCommand
{
		int begin, end;
	 	boolean run;
	 	private Cursor cursor;
	 	
	 	public Select(Editor editor, Cursor cursor)
	 	{
	 		super(editor);
			this.cursor = cursor;
	 		begin = 0;
	 		end = 0;
	 		run = false;
	 	}

	 	public void execute()
	 	{
	 	
	 	}

	 	@Override
	 	public Commands getType() {
	 		return Commands.select;
	 	}
	 	public void reset(){
	 		begin = cursor.getCursorPos();
		 	end = cursor.getCursorPos();
	 	}
	 	public void start(){
				begin = cursor.getCursorPos();
 		 		end = cursor.getCursorPos();
	 	}
	 	public void move(){
	 		System.out.println(cursor.getCursorPos()+" " + cursor.getX()+" " +editor.getBeginSelect()+" "+editor.getEndSelect());
	 		if(cursor.getX()==-1){
 				begin += cursor.getX();
 				editor.setBeginSelect(begin);
 				System.out.println(editor.getBeginSelect()+" "+editor.getEndSelect());
 			}
 			if(cursor.getX()==1){
 				end += cursor.getX();
 				editor.setEndSelect(end);
 				System.out.println(editor.getBeginSelect()+" "+editor.getEndSelect());
 			}
	 	}
	 	public boolean empty(){
	 		return editor.getClipboard().size() == 0;
	 	}
}
