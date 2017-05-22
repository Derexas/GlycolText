import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class GUI extends JFrame implements KeyListener
{
	private JTextArea ta;
	private JScrollPane scpane;
	
	private Core core;
	
	public GUI(Core core)
	{
	    super("Editeur de texte");
	    this.core = core;
	    setSize(600, 600);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container pane = getContentPane();
	
	    ta = new JTextArea(); //textarea
	
	    ta.setLineWrap(true);
	    ta.setWrapStyleWord(true);
	    ta.addKeyListener(this);
	
	    pane.add(ta, BorderLayout.CENTER);
	    
	    this.setActions();
	
	    setVisible(true);	    
	}
	
	private void setActions()
	{
	    InputMap inputMap = ta.getInputMap();
		ta.getActionMap().put("foo", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ctrl+A");
            }
        });
	    inputMap.put(KeyStroke.getKeyStroke("control A"), "foo");
		ta.getActionMap().put("foo", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ctrl+A");
            }
        });
	    inputMap.put(KeyStroke.getKeyStroke("control A"), "foo");
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		//this.ta.insert(e.getKeyChar()+"", this.ta.getCaretPosition());
		//System.out.println(e);
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

