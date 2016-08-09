package actions;

import paintbox.DrawPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by FckLove on 4/18/2016.
 */
public class ClearAction extends AbstractAction {
    public ClearAction(String name,ImageIcon icon,String shortDes,Integer mnemonic)
    {
        super(name,icon);
        putValue(SHORT_DESCRIPTION,shortDes);
        putValue(MNEMONIC_KEY,mnemonic);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DrawPanel.it.clear();
        DrawPanel.it.repaint();
        DrawPanel.it.removeTempPoint();
    }
}
