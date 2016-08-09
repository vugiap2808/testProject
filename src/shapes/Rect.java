package shapes;

import java.awt.*;

/**
 * Created by FckLove on 5/2/2016.
 */public class Rect extends FillShape {

    public Rect(Color strokeColor,Color fillColor,Point topLeftPoint,int width,int height,boolean isFilled)
    {
        this.strokeColor=strokeColor;
        this.fillColor=fillColor;
        this.topLeftPoint=topLeftPoint;
        this.width=width;
        this.height=height;
        this.isFilled=isFilled;
    }
    @Override
    public void draw(Graphics page) {
        if(isFilled)
        {
            //page.setColor(strokeColor);
            //page.drawOval((int)topLeftPoint.getX(),(int)topLeftPoint.getY(),width,height);
            page.setColor(fillColor);
            page.fillRect((int)topLeftPoint.getX(),(int)topLeftPoint.getY(),width,height);
        }else
        {
            page.setColor(strokeColor);
            page.drawRect((int)topLeftPoint.getX(),(int)topLeftPoint.getY(),width,height);
        }
    }
}
