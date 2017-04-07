import java.util.ArrayList;

public class Core {
	
	private ArrayList<Character> text = new ArrayList<Character>();
	private Invoker ivk;
	
	private int selectB, selectE;
	
	public void addText(String s)
	{
		for (char c : s.toCharArray())
			text.add(c);
	}
	
	public void clear(String s)
	{
		for (int i = 0; i < 5; i++)
			System.out.println("\n");
	}
	
}
