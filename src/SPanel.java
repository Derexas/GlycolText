import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SPanel extends JPanel {
	
	private JTextArea ta;

    public SPanel() {
    	setFocusable(true);
        initUI();
    }

    private void initUI() {
    	ta = new JTextArea();
        this.add(ta);   
    }

}