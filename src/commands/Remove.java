package commands;
import java.util.ArrayList;

import core.Text;

public class Remove  extends TextCommand{

	public Remove(Text text){
		super(text);
	}
	
	public void execute() {
		text.removeText(text.getBeginSelect(), text.getEndSelect() - text.getBeginSelect());
		System.out.println("Remove");
	}

	@Override
	public Commands getType() {
		return Commands.remove;
	}
	
}
