package paintbox;

import shapes.*;
import shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 * Created by thangnx on 4/14/2016.
 */
public class DrawPanel extends JPanel {
    public static int DRAWPANEL_WIDTH = 650;
    public static int DRAWPANEL_HEIGHT = 550;
    public static DrawPanel it;
    private boolean isFilled=true;
    private Point basePoint,currentPoint,tempPoint;
    private Color currentStrokeColor,currentFillColor;
    private int currentBtn;
    private Shape currentShape;
    private ArrayList<Shape> shapeList;

    public DrawPanel() {
        it=this;
        setMinimumSize(new Dimension(DRAWPANEL_WIDTH, DRAWPANEL_HEIGHT));
        setPreferredSize(new Dimension(DRAWPANEL_WIDTH, DRAWPANEL_HEIGHT));
        setBackground(Color.WHITE);
        currentStrokeColor=Color.BLACK;
        currentFillColor=Color.BLACK;
        shapeList=new ArrayList<Shape>();

        addMouseListener(new DrawPanelMouseListener());
        addMouseMotionListener(new DrawPanelMouseMotionListener());
    }

    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        if(shapeList.size()>0)
        {
            for(int i=0;i < shapeList.size();i++)
            {
                shapeList.get(i).draw(page);
            }
        }
    }
    public void removeTempPoint()
    {
        tempPoint=null;
    }

    public void newButtonClick(int newBtn)
    {
        currentBtn=newBtn;
    }

    public void setCurrentStrokeColor(Color strokeColor)
    {
        this.currentStrokeColor=strokeColor;
    }

    public void setCurrentFillColor(Color fillColor)
    {
        this.currentFillColor=fillColor;
    }
    public void setFilled(boolean isFilled)
    {
        this.isFilled=isFilled;
    }

    private class DrawPanelMouseListener implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            basePoint=e.getPoint();

            switch (currentBtn)
            {
                case ToolBar.LINE:
                    currentShape=new Line(currentStrokeColor,basePoint,basePoint);
                    shapeList.add(currentShape);
                    break;
                case ToolBar.POLY:
                    if(tempPoint!=null)
                    {
                        currentShape=new PolyLine(currentStrokeColor,tempPoint,basePoint);
                        shapeList.add(currentShape);
                    }else
                    {
                        currentShape=new PolyLine(currentStrokeColor,basePoint,basePoint);
                        shapeList.add(currentShape);
                    }
                    tempPoint=basePoint;
                    break;
                case ToolBar.OVAL:
                    currentShape=new Oval(currentStrokeColor,currentFillColor,basePoint,0,0,isFilled);
                    shapeList.add(currentShape);
                    break;
                case ToolBar.RECT:
                    currentShape=new Rect(currentStrokeColor,currentFillColor,basePoint,0,0,isFilled);
                    shapeList.add(currentShape);
                    break;
                case ToolBar.PEN:
                    currentShape=new Pencil(currentStrokeColor,basePoint,basePoint);
                    tempPoint=basePoint;
                    shapeList.add(currentShape);
                    break;
            }
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }
    }

    private class DrawPanelMouseMotionListener implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
            currentPoint=e.getPoint();
            switch (currentBtn)
            {
                case ToolBar.LINE:
                    ((Line)currentShape).setSecondPoint(currentPoint);
                    break;
                case ToolBar.POLY:
                    ((PolyLine)currentShape).setCurrentPoint(currentPoint);
                    tempPoint=currentPoint;
                    break;
                case ToolBar.OVAL:
                    ((Oval)(currentShape)).setProperties(basePoint,currentPoint);

                    break;
                case ToolBar.RECT:
                    ((Rect)(currentShape)).setProperties(basePoint,currentPoint);
                    break;
                case ToolBar.PEN:
                    currentShape=new Pencil(currentStrokeColor,tempPoint,currentPoint);
                    shapeList.add(currentShape);
                    tempPoint=currentPoint;
                    break;
            }
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    public void clear()
    {
        shapeList=new ArrayList<Shape>();
    }

    public void removeShape() {
        if (shapeList.size() > 0) {
            shapeList.remove(shapeList.size() - 1);
        }
    }

    public boolean checkShapeList()
    {
        if(shapeList.size()>0)
        {
            return false;
        }else return true;

    }
}

