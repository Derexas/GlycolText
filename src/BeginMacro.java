
public class BeginMacro implements Command
{
	protected Macro macro;
	
	public BeginMacro(Macro m)
	{
		macro = m; 
	}

	@Override
	public void execute() {
		macro.activate();
	}
	
}
