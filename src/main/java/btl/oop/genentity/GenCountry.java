/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;

import btl.oop.entity.Country;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 */
public class GenCountry extends GenEntity {
    private static ArrayList<String> listContinent;

    public ArrayList<Country> genCountry(int amount){
        GenCountry.listID = readFile("D:\\java\\listIDCountry.txt");
        GenCountry.listName = readFile("D:\\java\\listNameCountry.txt");
        GenCountry.listDescription = readFile("D:\\java\\listDescriptionCountry.txt");
        GenCountry.listContinent =  readFile("D:\\java\\listContinent.txt");
        ArrayList<Country> listCountry = new ArrayList<Country>();
        for(int i = 1; i <= amount; i++){
            String id = getRandom(listID) + i;
            String name = getRandom(listName);
            String description = getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            String continent = getRandom(listContinent);
            
            Country c = new Country(id, name, description, listSource, continent);
            
            listCountry.add(c);
        }
        return listCountry;      
    }
}
