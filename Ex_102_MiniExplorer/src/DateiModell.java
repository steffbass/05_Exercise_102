
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefan
 */
public class DateiModell extends AbstractListModel{

    private ArrayList <Datei> file = new ArrayList();
    
    @Override
    public int getSize() {
       return file.size();
    }

    @Override
    public Object getElementAt(int index) {
       return file.get(index);
    }
    
}
