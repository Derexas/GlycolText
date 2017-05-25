package commands;
import states.Text;

public class MoveCursor extends TextCommand
{
	
	public MoveCursor(Text text)
	{
		super(text);		
	}
	
	public void execute() {
		text.setCursorPos(text.getCursorPos()+text.getX());
		System.out.println("Move cursor");
	}

	@Override
	public Commands getType() {
		return Commands.moveCursor;
	}
	
}
