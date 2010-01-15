import processing.core.*;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:06:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class TetrisGUI extends Frame {

    public TetrisGUI() {
        super("Embedded PApplet");

        setLayout(new BorderLayout());
        PApplet embed = new Embedded();
        add(embed, BorderLayout.CENTER);

        // important to call this whenever embedding a PApplet.
        // It ensures that the animation thread is started and
        // that other internal variables are properly set.
        embed.init();
        setSize(400,500);

        setVisible(true);
    }

    public static void main(String args[]) {
        TetrisGUI g = new TetrisGUI();
    }
}


