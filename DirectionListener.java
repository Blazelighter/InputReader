import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

/* Detects directional input from the user using wasd, and converts it to 
    numpad notation, where the neutral position is 5. It looks something like this:

    7 8 9
    4 5 6
    1 2 3

    For example, if I press up and left (w and a keys), then it should return 7. If I
    press only right (d)m then it should return 6. When all keys are released, it should 
    revert back to 5.
*/
public class DirectionListener extends KeyAdapter {

    char up = 'w';
    char down = 's';
    char left = 'a';
    char right = 'd';

    int[][] numpadNotation = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int x = 1;
    int y = 1;
    JButton button;

    public DirectionListener(JButton button) {
        this.button = button;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();

        if (key == up) {
            y = 2;
        }
        if (key == down) {
            y = 0;
        }
        if (key == left) {
            x = 0;
        }
        if (key == right) {
            x = 2;
        }

        getDirection();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char key = e.getKeyChar();

        if (key == up) {
            y = 1;
        }
        if (key == down) {
            y = 1;
        }
        if (key == left) {
            x = 1;
        }
        if (key == right) {
            x = 1;
        }
        getDirection();
    }
    
    // Sets the button to the directional value
    public void getDirection() {
        String direction = Integer.toString(numpadNotation[y][x]);
        button.setText(direction);
    }
}
