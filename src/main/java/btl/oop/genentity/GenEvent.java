/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;

import btl.oop.entity.Event;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenEvent extends GenEntity {
    
    public ArrayList<Event> genEvent(int amount){
        GenEvent.listID = readFile("D:\\java\\listIDEvent.txt");
        GenEvent.listName = readFile("D:\\java\\listNameEvent.txt");
        GenEvent.listDescription = readFile("D:\\java\\listDescriptionEvent.txt");
        
        ArrayList<Event> listEvent = new ArrayList<Event>();
        
        for(int i = 1; i <= amount; i++){
            String id = getRandom(listID) + i;
            String name = getRandom(listName);
            String description = getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            
            Event e = new Event(id, name, description, listSource);
            listEvent.add(e);
        }
        return listEvent;
    }   
}
