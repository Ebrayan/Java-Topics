/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcertification;
/**
 * @author braya
 */

public class SstringPractices {
    
    public static void main (String...args){
      Integer a =  Integer.valueOf(128);
      Integer b =  Integer.valueOf(128);
      Integer c =  Integer.valueOf(127);
      Integer d =  Integer.valueOf(127);
      
        System.out.println( a==b);
        System.out.println( c==d);
      
        
        
    //    printComp(200, 248);
    
    }
    
    
    
    /*
    
    
    
    
    */
    private static void printComp(Object x, Object y) {
        String strX = x.toString().trim();
        String strY = y.toString().trim();
        System.out.println("Result is :" +strX.compareTo(strY));
    }   
}