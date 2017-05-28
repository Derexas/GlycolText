package commands;

import java.util.List;

import core.Cursor;

public class Select	 implements Command
{
		int begin, end;
	 	boolean run;
	 	private Cursor cursor;
	 	private List<Command> hist;
	 	
	 	public Select(Cursor cursor, List<Command> h)
	 	{
			this.cursor = cursor;
	 		begin = 1;
	 		end = 0;
	 		run = false;
		 	hist = h;
	 	}

	 	public void execute()
	 	{
	 		Command lastCommand = hist.get(hist.size()-1);
			if (lastCommand.getType() == Commands.select) {
	 			if (run){
	 				run = false;
	 				begin = 1;
	 		 		end = 0;
	 			}else {
	 				run = true;
	 				begin = cursor.getCursorPos();
	 		 		end = cursor.getCursorPos();
	 			}
	 			System.out.println("Select 1");
	 		}
			if(lastCommand.getType() == Commands.select) {
	 			if (run){
	 				if(cursor.getCursorPos()<begin){
		 				begin = cursor.getCursorPos();
		 			}
		 			if(cursor.getCursorPos()>end){
		 				end = cursor.getCursorPos();
		 			}
	 			}	
	 			System.out.println("Select 2");
	 		}	 		
	 	}

	 	@Override
	 	public Commands getType() {
	 		return Commands.select;
	 	}
}
