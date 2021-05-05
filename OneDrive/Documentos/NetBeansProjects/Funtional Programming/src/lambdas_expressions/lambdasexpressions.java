
package lambdas_expressions;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author braya
 */
public class lambdasexpressions {
 
    
    
    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
        for (Object feature : features) 
        { System.out.println(feature); } 
        //In Java 8: qList features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
        features.forEach(n -> System.out.println(n));
        // Even better use Method reference feature of Java 8 
        // method reference is denoted by :: (double colon) operator 
        // a examples
        features.forEach(System.out::println);




 
    }
    
}