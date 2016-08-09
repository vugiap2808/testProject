package paintbox;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by thangnx on 4/14/2016.
 */
public class PaintBox {
    public static int FRAME_WIDTH=670;
    public static int FRAME_HEIGH=600;
    public static void main(String[] args) {
        JFrame frame=new JFrame("PaintBox by FckLove");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MainPanel());
        frame.setMinimumSize(new Dimension(FRAME_WIDTH,FRAME_HEIGH));
        frame.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGH));
        frame.setResizable(false);

        MenuBar menuBar=new MenuBar();
        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setVisible(true);
    }
}
