import java.util.HashMap;

public class Invoker {
	
	private HashMap<Commands, Command> commands;
	
	public Invoker()
	{
		this.commands = new HashMap<Commands, Command>();
	}

	public void addCommand(Commands commandCode, Command command)
	{
		commands.put(commandCode, command);
	}
	
	public void execCommand(Commands commandCode)
	{
		commands.get(commandCode).execute();
	}
}
