/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;


import btl.oop.entity.Person;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */
public class GenPerson extends GenEntity{
    private static ArrayList<String> listJob;

    public ArrayList<Person> genPerson(int amount){
        GenPerson.listID = readFile("D:\\java\\listIDPerson.txt");
        GenPerson.listName = readFile("D:\\java\\listNamePerson.txt");
        GenPerson.listDescription = readFile("D:\\java\\listDescriptionPerson.txt");
        GenPerson.listJob = readFile("D:\\java\\listJobPerson.txt");
        ArrayList<Person> listPerson = new ArrayList<Person>();
        for(int i = 1; i <= amount; i++){            
            String id = getRandom(listID) + i;
            String name = getRandom(listName);
            String description = getRandom(listDescription);
            ArrayList<SourceExtracted> listSource = getRandomSource(listSourceEx);
            String job = getRandom(listJob);
            
            Person p = new Person(id, name, description, listSource, job);
            
            listPerson.add(p);
        }
        return listPerson;
    }
}
