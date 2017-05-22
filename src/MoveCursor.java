
public class MoveCursor extends TextCommand{
	private int dep;
	public MoveCursor(Text text, int d){
		super(text);
		dep = d;
		
	}
	
	public void execute() {
			text.setCursorPos(text.getCursorPos()+dep);
	}
	
}
