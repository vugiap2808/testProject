package paintbox;

import actions.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by thangnx on 4/14/2016.
 */
public class ToolBar extends JToolBar {
    public static int TOOLBAR_WIDTH = 650;
    public static int TOOLBAR_HEIGHT = 30;
    public static final int SELECT = 0;
    public static final int LINE = 1;
    public static final int OVAL = 2;
    public static final int RECT = 3;
    public static final int POLY = 4;
    public static final int STROKE = 5;
    public static final int FILL = 6;
    public static final int PEN = 7;

    private JRadioButton selectRbtn,lineRbtn,ovalRbtn,rectangleRbtn,polylineRbtn,pencilRbtn;
    public static JButton strokecolorBtn,fillcolorBtn,undoBtn;
    public static JCheckBox fillshapeCb;


    public ToolBar()
    {
        setPreferredSize(new Dimension(TOOLBAR_WIDTH, TOOLBAR_HEIGHT));

        //Select button
        selectRbtn = new JRadioButton(new SelectAction(null,null,
                "Select tool",null));
        selectRbtn.setIcon(new ImageIcon(this.getClass().getResource("images/select.gif")));
        selectRbtn.setSelectedIcon(new ImageIcon(this.getClass().getResource("images/selectOn.gif")));
        selectRbtn.setSelected(true);
        add(selectRbtn);
        addSeparator(new Dimension(50,30));

        //Pencil Button
        pencilRbtn=new JRadioButton(new PencilAction(null,null,
                "Draw by pencil",null));
        pencilRbtn.setIcon(new ImageIcon(this.getClass().getResource("images/pencil.png")));
        pencilRbtn.setSelectedIcon(new ImageIcon(this.getClass().getResource("images/pencilOn.png")));
        add(pencilRbtn);

        //Draw Line Button
        lineRbtn = new JRadioButton(new DrawLineAction(null,null,
                "Draw line",null));
        lineRbtn.setIcon(new ImageIcon(this.getClass().getResource("images/line.gif")));
        lineRbtn.setSelectedIcon(new ImageIcon(this.getClass().getResource("images/lineOn.gif")));
        add(lineRbtn);

        //Draw oval button
        ovalRbtn = new JRadioButton(new DrawOvalAction(null,null,
                "Draw Oval",null));
        ovalRbtn.setIcon(new ImageIcon(this.getClass().getResource("images/oval.gif")));
        ovalRbtn.setSelectedIcon(new ImageIcon(this.getClass().getResource("images/ovalOn.gif")));
        add(ovalRbtn);

        //Draw rectangle button
        rectangleRbtn = new JRadioButton(new DrawRectangleAction(null,null,
                "Draw rectangle",null));
        rectangleRbtn.setIcon(new ImageIcon(this.getClass().getResource("images/rect.gif")));
        rectangleRbtn.setSelectedIcon(new ImageIcon(this.getClass().getResource("images/rectOn.gif")));
        add(rectangleRbtn);

        //Draw polyline
        polylineRbtn = new JRadioButton(new DrawPolyLineAction(null,null,
                "Draw polyline",null));
        polylineRbtn.setIcon(new ImageIcon(this.getClass().getResource("images/poly.gif")));
        polylineRbtn.setSelectedIcon(new ImageIcon(this.getClass().getResource("images/polyOn.gif")));
        add(polylineRbtn);
        addSeparator(new Dimension(30,30));

        //Group radiobutton
        ButtonGroup group=new ButtonGroup();
        group.add(pencilRbtn);
        group.add(selectRbtn);
        group.add(lineRbtn);
        group.add(ovalRbtn);
        group.add(rectangleRbtn);
        group.add(polylineRbtn);

        //Stroke Color Button
        strokecolorBtn = new JButton(new StrokeColorAction("Stroke Color",null,
                "Set stroke color",null));
        strokecolorBtn.setBackground(Color.BLACK);
        strokecolorBtn.setForeground(Color.WHITE);
        add(strokecolorBtn);
        addSeparator();

        //Fill Color Button
        fillcolorBtn = new JButton(new FillColorAction("Fill Color",null,
                "Set fill color",null));
        fillcolorBtn.setBackground(Color.BLACK);
        fillcolorBtn.setForeground(Color.WHITE);
        add(fillcolorBtn);
        addSeparator(new Dimension(30,30));

        //Fill shape checkbox
        fillshapeCb = new JCheckBox(new FillShapeAction("Fill Shape",null,
                "Draw Shape with transparent or solid fill",null));
        fillshapeCb.setSelected(true);
        add(fillshapeCb);

        //Undo button
        undoBtn=new JButton(new UndoAction(null,null,"Undo a step",null));
        undoBtn.setIcon(new ImageIcon(this.getClass().getResource("images/Undo.jpg")));
        undoBtn.setPreferredSize(new Dimension(30,30));
        add(undoBtn);
    }
}
