package actions;

import paintbox.DrawPanel;
import paintbox.ToolBar;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Administrator on 19/04/2016.
 */
public class FillColorAction extends AbstractAction {
    private Color color;
    public FillColorAction(String name,ImageIcon icon,String shortDes,Integer mnemonic)
    {
        super(name,icon);
        putValue(SHORT_DESCRIPTION,shortDes);
        putValue(MNEMONIC_KEY,mnemonic);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        color=JColorChooser.showDialog(ToolBar.fillcolorBtn,"Chosse a color",Color.RED);
        ToolBar.fillcolorBtn.setBackground(color);
        DrawPanel.it.setCurrentFillColor(color);
        int rbgValue=color.getRed()+color.getBlue()+color.getGreen();
        if(rbgValue>250)
        {
            ToolBar.fillcolorBtn.setForeground(Color.BLACK);
        }else
        {
            ToolBar.fillcolorBtn.setForeground(Color.WHITE);
        }

    }
}
