import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import java.util.Scanner;

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

	public static void main(String[] args)
	{
		
		EventQueue.invokeLater(() -> {
            SFrame ex = new SFrame();
            ex.setVisible(true);
        });
	}

}

class KeyboardListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println("ejhfb");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
