
public class Paste extends TextCommand
{
	
	public Paste(Text text) {
		super(text);
	}

	@Override
	public void execute() {
		this.text.addText(this.text.getSelection(), this.text.getCursorPos());
	}
	
}
