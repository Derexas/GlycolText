import java.util.ArrayList;

public class Cut extends TextCommand{

	public Cut(Text text){
		super(text);
	}
	
	public void execute() {
		ArrayList<Character> press = new ArrayList<Character>();
		for(int i = text.getBeginSelect(); i<text.getEndSelect(); i++){
			press.add(text.getText(i));
		}
		text.presspapier = press;
		text.removeText(text.getBeginSelect(), text.getEndSelect() - text.getBeginSelect());
	}

}
