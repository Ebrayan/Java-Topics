/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcertification;

import java.util.ArrayList;

/**
 *
 * @author braya
 */
public class TestingArrayList {

    public static void main(String[] args) {
        
            ArrayList<String> list  = new ArrayList<>();
            list.add(0,"Hola1");
            list.add(0,"Hola2");
            list.add(0,"Hola3");
            list.add(0,"Hola4");
            list.add(0,"Adios");
            
            list.stream().forEach((t) -> {
                System.out.println(t); 
            });
            
            
            
            
            System.out.println(list.size());

        
    }
    
    
   


    
}
