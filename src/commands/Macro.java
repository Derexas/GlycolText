package commands;
import java.util.ArrayList;
import java.util.List;

public class Macro implements Command
{
	
	private ArrayList<Command> m;
	private List<Command> hist;
	private boolean macroing;
	
	public Macro(List<Command> hist){
		this.m = new ArrayList<Command>();
		this.hist = hist;
		this.macroing = false;
	}

	@Override
	public void execute()
	{
		Command lastCommand = hist.get(hist.size()-1);
		if (lastCommand.getType() == Commands.macro) {
			if (this.macroing) {
				this.launchMacro();
				System.out.println("Launch macro");
			} else {
				this.emptyList();
				System.out.println("Start macro");
			}
			this.macroing = !this.macroing;
		}
		if (macroing) {
			this.addCommands(lastCommand);
			System.out.println("Save in macro");
		}
	}
	
	private void launchMacro()
	{
		for (Command c : m)
			c.execute();
	}
	
	private void addCommands(Command c) {
		this.m.add(c);
	}
	
	private void emptyList() {
		m.clear();
	}

	@Override
	public Commands getType() {
		return Commands.macro;
	}
	
}
