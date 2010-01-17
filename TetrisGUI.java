import processing.core.PApplet;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:06:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class TetrisGUI extends JFrame {

    public TetrisGUI() {
        super("PTetris PApplet");

        setLayout(new BorderLayout());

        PApplet embed = new PTetris();
        add(embed, BorderLayout.CENTER);

        JButton pageStart = new JButton("PAGE_START");
        add(pageStart, BorderLayout.PAGE_END);

        // important to call this whenever embedding a PApplet.
        // It ensures that the animation thread is started and
        // that other internal variables are properly set.
        embed.init();
        setSize(200, 400);

        setVisible(true);
    }

    public static void main(String args[]) {
        TetrisGUI g = new TetrisGUI();
    }
}


