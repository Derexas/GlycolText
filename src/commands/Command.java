package commands;


public interface Command {
	
	public abstract void execute();
	
	public abstract Commands getType();

}
