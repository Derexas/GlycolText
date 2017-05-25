package commands;
import java.util.ArrayList;
import java.util.List;

import core.Text;

public class Insert extends TextCommand
{	
	private Character c;
	
	public Insert(Text text, Character ch)
	{
		super(text);
		c = ch;
	}
	
	public void execute() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add(c);
		text.addText(list, text.getCursorPos());
		System.out.println("Insert");
	}

	@Override
	public Commands getType() {
		return Commands.insert;
	}

}
