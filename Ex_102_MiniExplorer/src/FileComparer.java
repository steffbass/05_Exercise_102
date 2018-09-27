
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefan
 */
public class FileComparer implements Comparator<Datei>{

    @Override
    public int compare(Datei o1, Datei o2) {
       return   ((Datei) o1).getName().compareTo(((Datei) o2).getName());
    }

}
