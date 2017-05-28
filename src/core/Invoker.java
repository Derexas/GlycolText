package core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import commands.Command;
import commands.Commands;
import commands.Macro;

public class Invoker {
	
	private HashMap<Commands, Command> commands;
	private ArrayList<Command> hist;
	private boolean ismacroing;
	
	public Invoker()
	{
		this.commands = new HashMap<Commands, Command>();
		this.hist = new ArrayList<Command>();
		this.ismacroing = false;
	}

	public void addCommand(Commands commandCode, Command command)
	{
		commands.put(commandCode, command);
	}
	
	public void execCommand(Commands commandCode)
	{
		Macro macro = (Macro) this.commands.get(Commands.launchmacro);
		if (commandCode == Commands.macro) {
			if (!this.ismacroing) {
				System.out.println("Init Macro");
				this.ismacroing = true;
				macro.reset();
			} else {
				System.out.println("Stop Macro");
				this.ismacroing = false;
			}
		} else {
			Command command = commands.get(commandCode);
			this.hist.add(command);
			if (ismacroing && commandCode != Commands.launchmacro) {
				System.out.println("Add to Macro");
				macro.addCommands(this.hist.get(this.hist.size()-1));
			}
			command.execute();
		}
	}
	
	public List<Command> getHist()
	{
		return hist;
	}
}
