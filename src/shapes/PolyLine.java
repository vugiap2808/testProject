package shapes;

import java.awt.*;

/**
 * Created by Administrator on 28/04/2016.
 */
public class PolyLine extends Shape {
    private Point basePoint,currentPoint;
    public PolyLine(Color strokeColor,Point basePoint,Point currentPoint)
    {
        this.strokeColor=strokeColor;
        this.basePoint=basePoint;
        this.currentPoint=currentPoint;
        this.isFilled=false;
    }
    @Override
    public void draw(Graphics page) {
        page.setColor(strokeColor);
        page.drawLine(basePoint.x,basePoint.y,currentPoint.x,currentPoint.y);
    }
    public void setCurrentPoint(Point currentPoint)
    {
        this.currentPoint=currentPoint;
    }
}
