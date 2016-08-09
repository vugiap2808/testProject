package actions;

import paintbox.DrawPanel;
import paintbox.ToolBar;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Administrator on 19/04/2016.
 */
public class DrawOvalAction extends AbstractAction {
    public DrawOvalAction(String name,ImageIcon icon,String shortDes,Integer mnemonic)
    {
        super(name,icon);
        putValue(SHORT_DESCRIPTION,shortDes);
        putValue(MNEMONIC_KEY,mnemonic);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DrawPanel.it.newButtonClick(ToolBar.OVAL);
    }
}
