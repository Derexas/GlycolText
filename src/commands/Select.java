package commands;

import core.Cursor;

public class Select	 implements Command
{
		int begin, end;
	 	boolean run;
	 	private Cursor cursor;
	 	private Command c;
	 	
	 	public Select(Cursor cursor, Command com) {
			this.cursor = cursor;
	 		begin = 1;
	 		end = 0;
	 		run = false;
		 	this.c = com;
	 	}

	 	public void execute() {
	 		
			if (c.getType() == Commands.select) {
	 			if (run){
	 				run = false;
	 				begin = 1;
	 		 		end = 0;
	 			}else run = true;
	 		}
			if(c.getType() == Commands.moveCursor){
	 			if (run){
	 				if(cursor.getCursorPos()<begin){
		 				begin = cursor.getCursorPos();
		 			}
		 			if(cursor.getCursorPos()>end){
		 				end = cursor.getCursorPos();
		 			}
	 			}	
	 		}
	 		
	 	}

	 	@Override
	 	public Commands getType() {
	 		return Commands.select;
	 	}
}
