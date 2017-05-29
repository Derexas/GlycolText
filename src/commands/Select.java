package commands;

import java.util.List;

import core.Cursor;
import core.Editor;

public class Select	 extends EditorCommand
{
		int begin, end;
	 	boolean run;
	 	private Cursor cursor;
	 	private List<Command> hist;
	 	
	 	public Select(Editor editor, Cursor cursor, List<Command> h)
	 	{
	 		super(editor);
			this.cursor = cursor;
	 		begin = 0;
	 		end = 0;
	 		run = false;
		 	hist = h;
	 	}

	 	public void execute()
	 	{
	 		/*
	 		System.out.println(cursor.getCursorPos()+" " + cursor.getX()+" " +editor.getBeginSelect()+" "+editor.getEndSelect());
	 		Command lastCommand = hist.get(hist.size()-1);
			if (lastCommand.getType() == Commands.select) {
				System.out.println("blah");
				if (run){
	 				run = false;
	 				begin = 0;
	 		 		end = 0;		 		
	 			}else {
	 				run = true;
	 				begin = cursor.getCursorPos();
	 		 		end = cursor.getCursorPos();	 		 		
	 			}
	 			System.out.println("Select 1");
	 		}else if(lastCommand.getType() == Commands.moveCursor) {
				System.out.println("blah2");
	 			if (run){
	 				if(cursor.getCursorPos()<begin){
		 				begin = cursor.getCursorPos();
		 				editor.setBeginSelect(cursor.getCursorPos());
		 				System.out.println(editor.getBeginSelect()+" "+editor.getEndSelect());
		 			}
		 			if(cursor.getCursorPos()>end){
		 				end = cursor.getCursorPos();
		 				editor.setEndSelect(cursor.getCursorPos());
		 				System.out.println(editor.getBeginSelect()+" "+editor.getEndSelect());
		 			}
	 			}	
	 			System.out.println("Select 2");
	 		}
			*/		
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
