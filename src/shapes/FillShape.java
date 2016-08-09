package shapes;

import java.awt.*;

/**
 * Created by FckLove on 5/2/2016.
 */
abstract class FillShape extends Shape {
    protected Point topLeftPoint;
    protected int width,height;

    public void setProperties(Point firstPoint,Point secondPoint)
    {
        int x=secondPoint.x-firstPoint.x;
        int y=secondPoint.y-firstPoint.y;
        if(x>0)
        {
            if(y>0)
            {
                topLeftPoint=firstPoint;
            }else
            {
                topLeftPoint=new Point(firstPoint.x,firstPoint.y+y);
            }
        }else
        {
            if(y>0)
            {
                topLeftPoint=new Point(firstPoint.x+x,firstPoint.y);
            }else
            {
                topLeftPoint=new Point(firstPoint.x+x,firstPoint.y+y);
            }
        }
        width=Math.abs(x);
        height=Math.abs(y);
    }

    public Point getTopRightPoint()
    {
        return topLeftPoint;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setTopRightPoint(Point topRightPoint)
    {
        this.topLeftPoint=topRightPoint;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }

}
