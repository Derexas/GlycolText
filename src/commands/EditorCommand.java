package commands;

import core.Editor;

public abstract class EditorCommand implements Command
{
	protected Editor editor;
	
	public EditorCommand(Editor editor)
	{
		this.editor = editor;
	}
}
