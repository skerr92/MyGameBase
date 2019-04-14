package GameWindow;

import javafx.scene.shape.Rectangle;


public class Platforms extends Rectangle {

    private double width;
    private double height;
    private double x;
    private double y;

    public Platforms(double width, double height, double x, double y) {
        super(height, width, x, y);
    }


}
