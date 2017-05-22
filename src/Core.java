import java.util.ArrayList;

public class Core {
	
	private Invoker ivk;
	private Text text;
	private ArrayList<Memento> states;
	
	private int selectB, selectE;
	
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
