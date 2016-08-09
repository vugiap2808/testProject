package shapes;

import java.awt.*;

/**
 * Created by Administrator on 28/04/2016.
 */
abstract public class Shape {
    protected Color strokeColor;
    protected Color fillColor;
    protected Boolean isFilled;

    public Color getStrokeColor() {
        return strokeColor;
    }
    public Color getFillColor() {
        return fillColor;
    }
    public Boolean getIsFilled() {
        return isFilled;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    public void setIsFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }

    abstract public void draw(Graphics page);
}
