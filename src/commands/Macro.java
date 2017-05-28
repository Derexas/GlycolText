package commands;
import java.util.ArrayList;
import java.util.List;

public class Macro implements Command
{
	
	private ArrayList<Command> m;
	
	public Macro()
	{
		m = new ArrayList<Command>();
	}

	@Override
	public void execute()
	{
		this.launchMacro();
	}
	
	private void launchMacro()
	{
		if (!m.isEmpty()) {
			System.out.println("Exec Macro");
			for (Command c : m)
				c.execute();
		} else
			System.out.println("Can't Exec Macro : empty macro");
	}
	
	public void addCommands(Command c) {
		this.m.add(c);
	}
	
	public void reset() {
		m.clear();
	}

	@Override
	public Commands getType() {
		return Commands.macro;
	}
	
}
