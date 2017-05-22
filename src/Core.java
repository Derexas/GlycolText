import java.util.ArrayList;

public class Core {
	
	private Text text;
	private ArrayList<Memento> states;
	
	private Invoker invoker;
	
	public Core()
	{
		this.text = new Text();
		this.states = new ArrayList<Memento>();
		this.invoker = new Invoker();
		this.createCommands();
	}
	
	private void createCommands()
	{
		Command paste = new Paste(text);
		this.invoker.addCommand(Commands.paste, paste);
	}
	
	public void callCommand(Commands command)
	{
		invoker.execCommand(command);
	}
	
	public void clear(String s)
	{
		for (int i = 0; i < 5; i++)
			System.out.println("\n");
	}
	
}
