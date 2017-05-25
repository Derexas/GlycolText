package commands;
import java.util.ArrayList;
import java.util.List;

import states.Text;

public class Insert extends TextCommand
{
	
	public Insert(Text text)
	{
		super(text);
	}
	
	public void execute() {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add(text.getCharacter());
		text.addText(list, text.getCursorPos());
		System.out.println("Insert");
	}

	@Override
	public Commands getType() {
		return Commands.insert;
	}

}
