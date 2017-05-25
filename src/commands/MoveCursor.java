package commands;
import core.Cursor;

public class MoveCursor implements Command
{
	private Cursor cursor;
	
	public MoveCursor(Cursor cursor) {
		this.cursor = cursor;
	}

	public void execute() {
		cursor.setCursorPos(cursor.getCursorPos()+cursor.getX());
		System.out.println("Move cursor");
	}

	@Override
	public Commands getType() {
		return Commands.moveCursor;
	}
	
}
