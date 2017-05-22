import java.util.ArrayList;
import java.util.List;

public class Insert extends TextCommand{
	private Character c;
	public Insert(Text text, Character ch){
		super(text);
		c = ch;
	}
	
	public void execute() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add(c);
		text.addText(list, text.getCursorPos());
	}

}
