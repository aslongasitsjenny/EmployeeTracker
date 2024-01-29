import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMain { // Defining a public class named MyMain
    public static void main(String[] args) { // the main method which is the entry point of the program
        MyComponent component = new MyComponent(); // creating an instance of the MyComponent class
        JFrame frame = new JFrame(); // creating a new JFrame object
        JPanel panel = new JPanel(new GridLayout(2, 2)); // creating a new JPanel object with a 2x2 GridLayout

        frame.add(panel); // adding the panel to the frame

        // Add MyComponent to the JFrame
        frame.add(component); // adding the MyComponent object to the frame

        // Set the JFrame to be visible
        frame.setVisible(true); // setting the frame to be visible

        // Set the JFrame size
        frame.setSize(500, 500); // setting the size of the frame to 500x500 pixels

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting the close operation for the frame when the close button is clicked

        component.requestFocus(); // request focus on the component to receive key events

        // print the mouse button clicked and key pressed
        component.addMouseListener(new MouseListener() { // adding a mouse listener to the component
            @Override
            public void mouseClicked(MouseEvent e) { // defining the mouseClicked method
                System.out.println("Mouse button clicked: " + e.getButton()); // printing the mouse button clicked
            }

            @Override
            public void mousePressed(MouseEvent e) { // defining the mousePressed method
            }

            @Override
            public void mouseReleased(MouseEvent e) { // defining the mouseReleased method
            }

            @Override
            public void mouseEntered(MouseEvent e) { // defining the mouseEntered method
            }

            @Override
            public void mouseExited(MouseEvent e) { // defining the mouseExited method
            }
        });

        component.addKeyListener(new KeyListener() { // adding a key listener to the component
            @Override
            public void keyPressed(KeyEvent e) { // defining the keyPressed method
                System.out.println("Key pressed: " + e.getKeyChar()); // Printing the key pressed
            }

            @Override
            public void keyTyped(KeyEvent e) { // defining the keyTyped method
            }

            @Override
            public void keyReleased(KeyEvent e) { // defining the keyReleased method
            }
        });
    }
}
