/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;

import btl.oop.entity.Organization;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenOrganization extends GenEntity{
    private static ArrayList<String> listHeadOffice;
    public ArrayList<Organization> genOrganization(int amount){
        GenOrganization.listID = readFile("D:\\java\\listIDOrganization.txt");
        GenOrganization.listName = readFile("D:\\java\\listNameOrganization.txt");
        GenOrganization.listDescription = readFile("D:\\java\\listDescriptionOrganization.txt");
        GenOrganization.listHeadOffice = readFile("D:\\java\\listHeadOffice.txt");
        
        ArrayList<Organization> listOrganization = new ArrayList<Organization>();
        for(int i = 1; i <= amount; i++){
            String id = getRandom(listID) + i;
            String name = getRandom(listName);
            String description =getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            String headOffice = getRandom(listHeadOffice);
            
            Organization o = new Organization(id, name, description, listSource, headOffice);
            
            listOrganization.add(o);
        }
        return listOrganization;
    }
    
}
