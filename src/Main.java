
import javax.swing.JFrame;

import core.Core;
import gui.GUI;

public class Main {

	public static void main(String[] args)
	{		
		Core core = new Core();
		new GUI(core);
	}

}
