/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.entity;
import java.util.ArrayList;
/**
 *
 */
public class Event extends Entity {
    public Event(String id, String name, String description, ArrayList<SourceExtracted> sourceEx){
        super(id, name, description, sourceEx);
    }
}
