/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;

import btl.oop.entity.Location;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 */
public class GenLocation extends GenEntity {
     public ArrayList<Location> genLocation(int amount){
        GenLocation.listID = readFile("D:\\java\\listIDLocation.txt");
        GenLocation.listName = readFile("D:\\java\\listNameLocation.txt");
        GenLocation.listDescription = readFile("D:\\java\\listDescriptionLocation.txt");
        
        ArrayList<Location> listLocation = new ArrayList<Location>();
        
        for(int i = 1; i <= amount; i++){
            String id = getRandom(listID) + i;
            String name = getRandom(listID);
            String description = getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            
            Location l = new Location(id, name, description, listSource);
            listLocation.add(l);
        }
        return listLocation;
    }   
    
}
