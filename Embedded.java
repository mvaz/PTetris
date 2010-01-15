import processing.core.PApplet;

/**
 * Created by IntelliJ IDEA.
 * User: miguel
 * Date: Jan 15, 2010
 * Time: 11:13:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Embedded extends PApplet {

     public void setup() {
         // original setup code here ...
         size(400, 400);

         // prevent thread from starving everything else
         noLoop();
     }

     public void draw() {
         // drawing code goes here
     }

     public void mousePressed() {
         // do something based on mouse movement

         // update the screen (run draw once)
         redraw();
     }
}
