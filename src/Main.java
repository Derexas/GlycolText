
import javax.swing.JFrame;

public class Main {
	
	public static void initJFrame()
	{
		JFrame f = new JFrame();
		f.setTitle("Simple example");
        f.setSize(300, 200);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SPanel sp = new SPanel();
    	KListener listener = new KListener();
    	sp.addKeyListener(listener);
		f.add(sp);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		
		initJFrame();
	}

}
