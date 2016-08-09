package actions;

import paintbox.DrawPanel;
import paintbox.ToolBar;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Win 7 32bit VS2 on 06/05/2016.
 */
public class UndoAction extends AbstractAction {
    public UndoAction(String name,ImageIcon icon,String shortDes,Integer mnemonic)
    {
        super(name,icon);
        putValue(SHORT_DESCRIPTION,shortDes);
        putValue(MNEMONIC_KEY,mnemonic);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DrawPanel.it.removeShape();
        DrawPanel.it.repaint();
        if(DrawPanel.it.checkShapeList())
        {
            DrawPanel.it.removeTempPoint();
        }
    }
}
