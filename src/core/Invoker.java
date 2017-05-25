package core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import commands.Command;
import commands.Commands;

public class Invoker {
	
	private HashMap<Commands, Command> commands;
	private ArrayList<Command> hist;
	
	public Invoker()
	{
		this.commands = new HashMap<Commands, Command>();
		this.hist = new ArrayList<Command>();
	}

	public void addCommand(Commands commandCode, Command command)
	{
		commands.put(commandCode, command);
	}
	
	public void execCommand(Commands commandCode)
	{
		Command command = commands.get(commandCode);
		command.execute();
		this.hist.add(command);
	}
	
	public List<Command> getHist()
	{
		return hist;
	}
}
