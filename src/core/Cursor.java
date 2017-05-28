package core;

public class Cursor {
	
	private int cursorPos, x, max;
	
	public Cursor() {
		this(0, 0, 0);
	}

	public Cursor(int cursorPos, int x, int max) {
		this.cursorPos = cursorPos;
		this.x = x;
		this.max = max;
	}

	public int getCursorPos() {
		return cursorPos;
	}

	public void setCursorPos(int cursorPos) {
		if (cursorPos >= 0 && cursorPos <= max)
			this.cursorPos = cursorPos;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void addToMax(int max) {
		this.max += max;
	}

}
