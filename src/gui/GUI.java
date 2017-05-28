package gui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import commands.Commands;
import core.Core;

public class GUI extends JFrame implements KeyListener,MouseListener
{
	private JTextArea ta;
	private JScrollPane scpane;
	
	private Core core;
	
	public GUI(Core core)
	{
	    super("Editeur de texte");
	    this.core = core;
	    this.core.setGUI(this);
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
		HashMap<Commands, String[]> actions = new HashMap<Commands, String[]>();

		actions.put(Commands.remove, new String[]{"Remove", "BACK_SPACE"});
		actions.put(Commands.copy, new String[]{"Copy", "control C"});
		actions.put(Commands.cut, new String[]{"Cut", "control X"});
		actions.put(Commands.paste, new String[]{"Paste", "control V"});
		actions.put(Commands.undo, new String[]{"Undo", "control U"});
		actions.put(Commands.redo, new String[]{"Redo", "control R"});
		/*actions.put(Commands.up, new String[]{"Up", "UP"});
		actions.put(Commands.down, new String[]{"Down", "DOWN"});*/
	    
		Iterator<Entry<Commands, String[]>> it = actions.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Commands, String[]> pair = (Map.Entry<Commands, String[]>)it.next();
			ta.getActionMap().put(pair.getValue()[0], new AbstractAction() {
	            public void actionPerformed(ActionEvent e) {
	                System.out.println(pair.getValue()[1]);
	                core.callCommand(pair.getKey());
	            }
	        });
		    inputMap.put(KeyStroke.getKeyStroke(pair.getValue()[1]), pair.getValue()[0]);
		}
		
		ta.getActionMap().put("Left", new AbstractAction() {
			
            public void actionPerformed(ActionEvent e) {
                System.out.println("LEFT");
                core.setCursorMove(-1);
                core.callCommand(Commands.moveCursor);
                //ta.setCaretPosition(ta.getCaretPosition()-1);
            }
        });
	    inputMap.put(KeyStroke.getKeyStroke("LEFT"), "Left");
		
		ta.getActionMap().put("Right", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("RIGHT");
                core.setCursorMove(1);
                core.callCommand(Commands.moveCursor);
            }
        });
	    inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "Right");

		ta.getActionMap().put("Select", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("control S");
                core.setSelection(ta.getSelectionStart(), ta.getSelectionEnd());
                core.callCommand(Commands.select);
            }
        });
	    inputMap.put(KeyStroke.getKeyStroke("control S"), "Select");
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyChar() != KeyEvent.CHAR_UNDEFINED && !e.isControlDown()
				&& e.getKeyChar() != KeyEvent.VK_BACK_SPACE){
			e.consume();
			this.core.setCharacter(e.getKeyChar());
			this.core.callCommand(Commands.insert);
			//System.out.println(e);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		e.consume();		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		e.consume();		
	}
	
	public void setText(ArrayList<Character> text, int pos)
	{    
	    StringBuilder builder = new StringBuilder(text.size());
	    for(Character ch: text)
	    {
	        builder.append(ch);
	    }
	    this.ta.setText(builder.toString());
	    System.out.println(builder.toString());
	    this.ta.setCaretPosition(pos);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		e.consume();		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		e.consume();		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		e.consume();		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		e.consume();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		e.consume();		
	}

}

