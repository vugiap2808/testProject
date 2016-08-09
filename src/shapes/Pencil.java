package shapes;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by FckLove on 5/5/2016.
 */
public class Pencil extends Shape {
    private Point basePoint,currentPoint;
    public Pencil(Color strokeColor,Point basePoint,Point currentPoint)
    {
        this.strokeColor=strokeColor;
        this.basePoint=basePoint;
        this.currentPoint=currentPoint;
    }
    @Override
    public void draw(Graphics page) {
        page.setColor(strokeColor);
        page.drawLine(basePoint.x,basePoint.y,currentPoint.x,currentPoint.y);
    }
    public void setCurrentPoint(Point point)
    {
        this.currentPoint=point;
    }
}
