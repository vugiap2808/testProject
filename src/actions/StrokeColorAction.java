package actions;

import paintbox.DrawPanel;
import paintbox.ToolBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Administrator on 19/04/2016.
 */
public class StrokeColorAction extends AbstractAction {
    private Color color;
    public StrokeColorAction(String name,ImageIcon icon,String shortDes,Integer mnemonic)
    {
        super(name,icon);
        putValue(SHORT_DESCRIPTION,shortDes);
        putValue(MNEMONIC_KEY,mnemonic);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        color=JColorChooser.showDialog(ToolBar.strokecolorBtn,"Choose a Color",Color.RED);
        ToolBar.strokecolorBtn.setBackground(color);
        DrawPanel.it.setCurrentStrokeColor(color);

        if(color.getRed()>127)
        {
            ToolBar.strokecolorBtn.setForeground(Color.BLACK);
        }else
        {
            ToolBar.strokecolorBtn.setForeground(Color.WHITE);
        }
    }
}
