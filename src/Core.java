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
	}
	
	private void createCommands()
	{
		this.invoker.addCommand("Paste", new Paste(text));
	}
	
	public void addText(String s, int pos)
	{
		text.addText(s, pos);
	}
	
	public void clear(String s)
	{
		for (int i = 0; i < 5; i++)
			System.out.println("\n");
	}
	
}
