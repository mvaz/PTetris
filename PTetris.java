import processing.core.PApplet;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:13:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class PTetris extends PApplet {

    //	An array of stripes
    Piece[] pieces = new Piece[10];
    int k = 0;

    public void setup() {
        size(200, 400);
        newPiece();
        // Initialize all "stripes"
    }

    public void newPiece() {
        pieces[k] = new Piece(this);
        k = k + 1;
    }

    public void draw() {
        background(100);
        // Move and display all "stripes"
        for (int j = 0 ; j < k ; j++) {
            pieces[j].move();
            pieces[j].display();
        }
    }

    public void mousePressed() {
        // do something based on mouse movement

        // update the screen (run draw once)
        redraw();
    }
}
