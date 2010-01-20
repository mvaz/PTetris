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
    private int numberColumns = 10;
    private int numberRows = 30;
    private float columnWidth;
    private float rowHeight;

    Model model;

    public void setup() {
        size(200, 400);
        // recompute
        columnWidth = width / (float) numberColumns;
        rowHeight = height / (float) numberRows;

        model = new Model(this, numberColumns, numberRows);
        model.setSpeed((float) 1.0);
    }


    // the draw function that takes care of visualization
    public void draw() {
        background(100);

        drawGrid();

        model.update();
        model.draw();

        if (keyPressed) {
            System.out.println(key);
        }
    }

    // not really sure what this is for...

    public void redraw() {
        columnWidth = width / (float) numberColumns;
        rowHeight = height / (float) numberRows;
    }

    /**
     * Plots the grid of lines and rows.
     */
    public void drawGrid() {
        for (int c = 1; c < numberColumns; c++) {
            stroke(0xFFCCFF00);
            line(c * columnWidth, 0, c * columnWidth, height);
        }

        for (int l = 1; l < numberRows; l++) {
            stroke(0xFFCCFF00);
            line(0, l * rowHeight, width, l * rowHeight);
        }
    }

    /**
     * Draws a piece falling down
     *
     * @param p the piece to be drawn
     */
    void drawPiece(Piece p) {
        fill(255, 100);
        noStroke();
        rect(p.getX() * columnWidth, p.getY(), columnWidth, rowHeight);
    }


//    public void keyPressed() {
//        System.out.println("Key pressed was: " + key);
////        if (key == 0) {
////            value = 255;
////        } else {
////            value = 0;
////        }
//    }

    public void keyPressed() {
        switch (keyCode) {
            case 37:  model.moveLeft(); break;
            case 39:  model.moveRight(); break;
            case 38:  model.changeConfiguration(); break;
            case 40:  model.moveDown(); break;
        }
    }

    public void keyTyped() {
        System.out.println( "typed " + key + " " + keyCode);
    }

    public void keyReleased() {
        System.out.println( "released " + key + " " + keyCode );
    }

    /**
     * Draws the rectangle corresponding to the grid...
     *
     * @param c column number
     * @param l
     * @param i
     */
    public void draw(int c, int l, int i) {
        fill(i, 100);
        rect(c * columnWidth, l * rowHeight, columnWidth, rowHeight);
    }
}
