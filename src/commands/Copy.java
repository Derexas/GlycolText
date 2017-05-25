package commands;
import java.util.ArrayList;

import core.Text;

public class Copy extends TextCommand{

	public Copy(Text text){
		super(text);
	}
	
	public void execute() {
		ArrayList<Character> press = new ArrayList<Character>();
		for(int i = text.getBeginSelect(); i<text.getEndSelect(); i++){
			press.add(text.getText(i));
		}
		text.presspapier = press;
		System.out.println("Copy");
	}
	
	public Commands getType()
	{
		return Commands.copy;
	}
}
