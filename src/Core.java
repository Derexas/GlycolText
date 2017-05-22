import java.util.ArrayList;

public class Core {
	
	private Text text;
	private ArrayList<Memento> states;
	
	private Invoker invoker;
	
	public Core()
	{
		states = new ArrayList<Memento>();
		invoker = new Invoker();
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
