/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.oop.genentity;
import btl.oop.entity.SourceExtracted;
import static btl.oop.readfile.ReadFile.readFile;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Anh Phuong
 */


public class GenSourceExtracted {
    private static ArrayList<String> listLinkEx;
    private static ArrayList<String> listTimeEx;
    
    public static ArrayList<SourceExtracted> genSourceExtracted(){
        GenSourceExtracted.listLinkEx = readFile("D:\\java\\listLinkEx.txt");
        GenSourceExtracted.listTimeEx = readFile("D:\\java\\listTimeEx.txt");
        ArrayList<SourceExtracted>  listSource = new ArrayList<SourceExtracted>();
        for(int i = 0; i < listLinkEx.size(); i++){
            for(int j = 0; j < listTimeEx.size(); j++){
                String linkEx = listLinkEx.get(i);
                String timeEx = listTimeEx.get(j);
                SourceExtracted source = new SourceExtracted(linkEx, timeEx);                
                listSource.add(source);
            }
        }
        return listSource;
    }
//    public static void main(String[] args) {
//        GenSourceExtracted s1 = new GenSourceExtracted();
//        ArrayList<SourceExtracted> lala = new ArrayList<SourceExtracted>();
//        lala = s1.genSourceExtracted();
//        for(SourceExtracted t : lala){
//            System.out.println(t.toString());
//        }
//    }
}

