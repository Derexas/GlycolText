package commands;
import states.Text;

public class MoveCursor extends TextCommand
{
	private int dep;
	
	public MoveCursor(Text text, int d)
	{
		super(text);
		dep = d;
		
	}
	
	public void execute() {
		text.setCursorPos(text.getCursorPos()+dep);
		System.out.println("Move cursor");
	}

	@Override
	public Commands getType() {
		return Commands.moveCursor;
	}
	
}
