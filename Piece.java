import processing.core.PApplet;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:53:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Piece {

    float x;
    float y;
    float width;
    float height;
    float speed;

     // The parent PApplet that we will render ourselves onto
    PTetris parent;

    public Piece(PTetris p) {
        parent = p;
        speed = parent.random(0,1);
        width = 20;
        height = 20;
        
        x = parent.random(0, parent.width);
        y = 0;
    }

    // Draw stripe
    void display() {
        parent.fill(255, 100);
        parent.noStroke();
        parent.rect(x, y, width, height);
    }

    // Move stripe
    void move() {
        System.out.println( y );
//        do {
        y += speed;
        if( y >= (parent.height - height) ) {
//            TODO add object to grid
            if (speed > 0)
                parent.newPiece();
            speed = 0;
        }
//        if (x > parent.width + 20) x = -20;
        System.out.println( y + " < " + parent.height );
    }
}
