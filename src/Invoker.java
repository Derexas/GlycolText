import java.util.HashMap;

public class Invoker {
	
	private HashMap<String, Command> commands;
	
	public Invoker()
	{
		this.commands = new HashMap<String, Command>();
	}

	public void addCommand(String commandName, Command command)
	{
		commands.put(commandName, command);
	}
	
	public void execCommand(String commandName)
	{
		commands.get(commandName).execute();
	}
}
