package paintbox;

import net.miginfocom.swing.MigLayout;
import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by thangnx on 4/14/2016.
 */
public class MainPanel extends JPanel {

    public static int MAINPANEL_WIDTH = 650;
    public static int MAINPANEL_HEIGHT = 570;
    public MainPanel()
    {
        setLayout(new MigLayout());
        setBackground(Color.LIGHT_GRAY);
        setMinimumSize(new Dimension(MAINPANEL_WIDTH, MAINPANEL_HEIGHT));
        setPreferredSize(new Dimension(MAINPANEL_WIDTH, MAINPANEL_HEIGHT));

        ToolBar toolebar=new ToolBar();
        add(toolebar,"wrap 5");

        DrawPanel drawPanel=new DrawPanel();

        add(drawPanel);

    }


}
