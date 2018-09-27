
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefan
 */
public class FileListRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean hasFocus) {
        
        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);
        
        //if( o instanceof Item ){
          //  Item item = (Item)o;
         //   label.setForeground(item.getColor());
        //}
        
        label.setBackground( isSelected ? Color.lightGray : Color.white );
        
        return label;
    }
}
