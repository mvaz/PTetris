import processing.core.PApplet;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:53:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Piece {

    private int x;
    private float y;

    public Piece(int x, float y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
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

    public void setX(int v) {
        //To change body of created methods use File | Settings | File Templates.
        this.x = v;
    }
}
