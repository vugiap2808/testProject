package paintbox;

import actions.*;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by thangnx on 4/14/2016.
 */
public class MenuBar extends JMenuBar {
    private JMenu menuFile,menuEdit;
    private JMenuItem itemNew,itemOpen,itemExit,itemCopy,itemCut,itemClear,itemPaste,itemUndo;
    private final Dimension spaceItem=new Dimension(140,30);
    public MenuBar()
    {
        ////////////////////////////////////////////
        //             MENU FILE                  //
        ////////////////////////////////////////////
        menuFile=new JMenu("File");
        add(menuFile);

        //Item New
        itemNew=new JMenuItem(new NewAction("New Drawing",new ImageIcon(this.getClass().getResource("images/small_new_icon.png")),
                "Create a new drawing",new Integer(KeyEvent.VK_N)));
        itemNew.setPreferredSize(spaceItem);
        menuFile.add(itemNew);

        //Item Open
        itemOpen=new JMenuItem(new OpenAction("Open Drawing",new ImageIcon(this.getClass().getResource("images/small_open_icon.png")),
                "Open an exist drawing",new Integer(KeyEvent.VK_O)));
        itemOpen.setPreferredSize(spaceItem);
        menuFile.add(itemOpen);
        menuFile.addSeparator();

        //Item Exit
        itemExit=new JMenuItem((new ExitAction("Exit",new ImageIcon(this.getClass().getResource("images/small_exit_icon.png")),
                "Quit the program",new Integer(KeyEvent.VK_X))));
        itemExit.setPreferredSize(spaceItem);
        menuFile.add(itemExit);

        ////////////////////////////////////////////
        //             MENU EDIT                  //
        ////////////////////////////////////////////
        menuEdit=new JMenu("Edit");
        add(menuEdit);

        //Item Copy
        itemCopy=new JMenuItem(new CopyAction("Copy",new ImageIcon(this.getClass().getResource("images/small_copy_icon.png")),
                "Copy selected object from current drawing",new Integer(KeyEvent.VK_C)));
        itemCopy.setPreferredSize(spaceItem);
        menuEdit.add(itemCopy);

        //Item Cut
        itemCut=new JMenuItem(new CutAction("Paste",new ImageIcon(this.getClass().getResource("images/small_cut_icon.png")),
                "Cut selected object from current drawing",new Integer(KeyEvent.VK_U)));
        itemCut.setPreferredSize(spaceItem);
        menuEdit.add(itemCut);

        //Item Paste
        itemPaste=new JMenuItem(new PasteAction("Paste",new ImageIcon(this.getClass().getResource("images/small_paste_icon.png")),
                "Paste object to current drawing",new Integer(KeyEvent.VK_P)));
        itemPaste.setPreferredSize(spaceItem);
        menuEdit.add(itemPaste);
        menuEdit.addSeparator();

        //Item Remove
        itemUndo=new JMenuItem(new UndoAction("Undo",new ImageIcon(this.getClass().getResource("images/small_undo.jpg")),
                "Undo a step",new Integer(KeyEvent.VK_Z)));
        itemUndo.setPreferredSize(spaceItem);
        menuEdit.add(itemUndo);

        //Item Clear
        itemClear=new JMenuItem(new ClearAction("Clear",new ImageIcon(this.getClass().getResource("images/small_clear_icon.png")),
                "Clear current drawing",new Integer(KeyEvent.VK_L)));
        itemClear.setPreferredSize(spaceItem);
        menuEdit.add(itemClear);

    }
}
