import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

public class MyComponent extends JComponent implements MouseListener, KeyListener {
    private int quadrant = 0;
    private Map<Integer, Integer> quadrantCount = new HashMap<>();

    public MyComponent() {
        addMouseListener(this);   // add the mouse listener to this component
        addKeyListener(this);     // add the key listener to this component
        setFocusable(true);        // make this component focusable
    }

    private void determineQuadrant(int x, int y) {
        int width = getWidth();    // get the width of this component
        int height = getHeight();  // get the height of this component

        if (x < width / 2 && y < height / 2) {  // if the mouse click is in the top-left quadrant
            quadrant = 1;                       // set the quadrant number to 1
        } else if (x > width / 2 && y < height / 2) {  // if the mouse click is in the top-right quadrant
            quadrant = 2;                              // set the quadrant number to 2
        } else if (x > width / 2 && y > height / 2) {  // if the mouse click is in the bottom-right quadrant
            quadrant = 3;                              // set the quadrant number to 3
        } else if (x < width / 2 && y > height / 2) {  // if the mouse click is in the bottom-left quadrant
            quadrant = 4;                              // set the quadrant number to 4
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        determineQuadrant(e.getX(), e.getY());                             // determine the quadrant of the mouse click
        quadrantCount.put(quadrant, quadrantCount.getOrDefault(quadrant, 0) + 1);   // increment the count for the current quadrant
        System.out.println(quadrantCount);                                  // print the quadrant count
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = MouseInfo.getPointerInfo().getLocation().x - getLocationOnScreen().x;
        int y = MouseInfo.getPointerInfo().getLocation().y - getLocationOnScreen().y;
        determineQuadrant(x, y);
        quadrantCount.put(quadrant, quadrantCount.getOrDefault(quadrant, 0) + 1);
        System.out.println(quadrantCount);
        // use determine quadrant as its just the maths and doesnt mention anything about a cursor,
        // find where the mouse is
        //increment quadrantcount using the co-ords from the mouse
    }





    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}