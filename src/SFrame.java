import java.awt.EventQueue;
import javax.swing.JFrame;

public class SFrame extends JFrame {

    public SFrame() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}