import processing.core.PApplet;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:13:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Embedded extends PApplet {

    //	An array of stripes
    Stripe[] stripes = new Stripe[2];

    public void setup() {
        size(200, 200);
        // Initialize all "stripes"
        for (int i = 0; i < stripes.length; i++) {
            stripes[i] = new Stripe(this);
        }
    }

    public void draw() {
        background(100);
        // Move and display all "stripes"
        for (int i = 0; i < stripes.length; i++) {
            stripes[i].move();
            stripes[i].display();
        }
    }

    public void mousePressed() {
        // do something based on mouse movement

        // update the screen (run draw once)
        redraw();
    }
}
