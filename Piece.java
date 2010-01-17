import processing.core.PApplet;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:53:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Piece {

    private float x;
    private float y;

     // The parent PApplet that we will render ourselves onto
    PTetris parent;

    public Piece(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    // Move stripe
    void moveDown(float speed) {
        y += speed;
//        System.out.println( y );
//        if (x > parent.width + 20) x = -20;
//        System.out.println( y + " < " + parent.height );
    }
}
