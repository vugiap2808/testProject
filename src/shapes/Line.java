package shapes;

import java.awt.*;

/**
 * Created by Administrator on 28/04/2016.
 */
public class Line extends Shape {
    private Point firstPoint;
    private Point secondPoint;

    public Line(Color strokeColor, Point firstPoint, Point secondPoint) {
        this.strokeColor = strokeColor;
        this.fillColor = strokeColor;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.isFilled = false;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public void draw(Graphics page) {
        page.setColor(strokeColor);
        page.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
    }
}
