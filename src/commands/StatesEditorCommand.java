package commands;
import core.Editor;
import states.States;

public abstract class StatesEditorCommand extends EditorCommand
{
	States states;

	public StatesEditorCommand(Editor editor, States states) {
		super(editor);
		this.states = states;
	}
	
	

}
