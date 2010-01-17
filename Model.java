/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 17, 2010
 * Time: 11:09:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Model {

    Matrix grid;
    int numberColumns;
    int numberRows;
    float speed;

    PTetris parent;
    Piece currentPiece;
    
    public Model(PTetris parent, int numberColumns, int numberRows) {
        this.numberColumns = numberColumns;
        this.numberRows = numberRows;
        this.parent = parent;

        grid = new Matrix( this.numberColumns, this.numberRows);
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void draw() {
        // draw grid
        for (int c=0; c < this.numberColumns ; c++ )
            for (int l=0; c < this.numberRows ; c++ )
//                if (grid.getElement(c,l) > 0.0)
                if (grid.getElement(l,c) > 0.0)
                    // draw it!
                    parent.draw( c, l, 1);

        parent.drawPiece(currentPiece);
        
    }

    public void newPiece() {
        float x = (float) Math.floor( parent.random( 0, numberColumns) );
        float y = (float) numberRows;
        currentPiece = new Piece( x, y);
    }

    public void update() {
        // move the current piece down
        currentPiece.moveDown( speed );

        // check whether the current piece has reached the end
//        currentPiece.
//        if( y >= (parent.height - height) ) {
//            TODO add object to grid
//            if (speed > 0)
//                parent.newPiece();
//            speed = 0;
//        }
    }
}
