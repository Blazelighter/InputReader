import javax.swing.*;


public class TestInput {
    
    public static void main(String[] args) {

        JFrame displayFrame = new JFrame();

        // Displays the wasd input using numpad notation
        JButton directionDisplay = new JButton();
        DirectionListener directionInput = new DirectionListener(directionDisplay);
        directionDisplay.addKeyListener(directionInput);
        displayFrame.add(directionDisplay);

        // This button displays which key was pressed last. Overrides the other button.
        // JButton keyDisplay = new JButton();
        // BasicListener keyInput = new BasicListener(keyDisplay);
        // keyDisplay.addKeyListener(keyInput);
        // displayFrame.add(keyDisplay);
        

        displayFrame.setTitle("Input Reader");
        displayFrame.setSize(422, 400);
        displayFrame.setVisible(true);
    }
}
