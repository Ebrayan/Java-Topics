/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcertification;

/**
 *
 * @author braya
 */
public class WorkingWithExceptions {
    
    
    
    
    public static void main(String[] args) {
        
        try {
                double testNumbre =  5/0;
        } catch (Exception e) {
        
            e.printStackTrace();
            System.out.println(e.toString());
        
        }
        
        
    }
}
