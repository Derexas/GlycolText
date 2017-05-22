import java.util.ArrayList;

public class Remove  extends TextCommand{

	public Remove(Text text){
		super(text);
	}
	
	public void execute() {
		text.removeText(text.getBeginSelect(), text.getEndSelect() - text.getBeginSelect());
	}
	
}
