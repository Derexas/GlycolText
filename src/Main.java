import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	
	private static ArrayList<Character> text = new ArrayList<Character>();
	
	public static void addText(String s)
	{
		for (char c : s.toCharArray())
			text.add(c);
	}
	
	public static void clear(String s)
	{
		for (int i = 0; i < 5; i++)
			System.out.println("\n");
	}
	
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
