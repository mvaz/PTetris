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
    private int numberColumns = 10;
    private int numberRows = 30;
    private float columnWidth;
    private float rowHeight;

    Model model;

    int k = 0;

    public PTetris() {
        columnWidth = width / numberColumns;
        rowHeight   = width / numberColumns;
        model = new Model( this, numberColumns, numberRows);
    }

    public void setup() {
        size(200, 400);
//        newPiece();
        // Initialize all "stripes"
    }


    public void update() {
        model.update();
    }

    public void draw() {
        background(100);
        drawGrid();
        model.draw();
    }

    /**
     * Plots the grid of lines and rows.
     */
    public void drawGrid() {
        for (int c = 1; c < numberColumns ; c++) {
            stroke(0xFFCCFF00);
            line( c * width / numberColumns, 0, c * width / numberColumns, height );
        }

        for (int l = 1; l < numberRows ; l++) {
            stroke(0xFFCCFF00);
            line( 0, l * height / numberRows, width, l * height / numberRows );
        }
    }

    // Draw stripe

    /**
     * Draws a piece falling down
     * @param p the piece to be drawn
     */
    void drawPiece(Piece p) {
        fill(255, 100);
        noStroke();
        rect(p.getX(), p.getY(), columnWidth, rowHeight);
    }


    public void draw(int c, int l, int i) {
         rect(c * columnWidth, l * rowHeight, columnWidth, rowHeight);
    }
}
