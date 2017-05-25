package core;

public class Cursor {
	
	private int cursorPos, x;
	
	public Cursor() {
		this(0, 0);
	}

	public Cursor(int cursorPos, int x) {
		this.cursorPos = cursorPos;
		this.x = x;
	}

	public int getCursorPos() {
		return cursorPos;
	}

	public void setCursorPos(int cursorPos) {
		this.cursorPos = cursorPos;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
