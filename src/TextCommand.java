
public abstract class TextCommand implements Command
{
	protected Text text;
	
	public TextCommand(Text text)
	{
		this.text = text;
	}
}
