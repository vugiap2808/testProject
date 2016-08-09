package actions;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by FckLove on 4/18/2016.
 */
public class CutAction extends AbstractAction {
    public CutAction(String name,ImageIcon icon,String shortDes,Integer mnemonic)
    {
        super(name,icon);
        putValue(SHORT_DESCRIPTION,shortDes);
        putValue(MNEMONIC_KEY,mnemonic);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("you pick cut action");
    }
}
