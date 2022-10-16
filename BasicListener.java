import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class BasicListener extends KeyAdapter {
    
    JButton button;

    public BasicListener(JButton button) {
        this.button = button;
    }

    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        button.setText(String.valueOf(key));
    }
}
