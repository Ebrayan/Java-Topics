/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcertification;

/*
 * @author brayan
 */

public class TestingReferences {
    
    
    public static void main (String ...args){
        
          int total=0;
         
        long numero1=System.currentTimeMillis();
         
         
        
        
        
        long numero2=System.currentTimeMillis();
 
        System.out.println(numero2-numero1);
        System.out.println(total);
 
    }
    
    
    public static  int duplicar( int numero) {
         
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        return numero*2;
    }
    
}
