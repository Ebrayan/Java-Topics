package forcertification;

 
import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;




public class ForCertification {

    private static class Persona {
        public Persona(String nombre, int age){this.age=age;this.name = nombre; }
        public String name; 
        public int age;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 
  
        var lista = Arrays.asList(5, 2, 3,8,54,98, 4);    
        var sum= lista.stream().sorted().limit(3).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        
        
         var personas = Arrays.asList(
                new Persona("Juan1",1),
                new Persona("Juan2",2),
                new Persona("Juan3",3),
                new Persona("Juan4",4),
                new Persona("Juan5",5)
        );
        
        
        var hola = personas.stream().flatMap((t) -> {
            return null; //To change body of generated lambdas, choose Tools | Templates.
        });
         
        
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer suma = integers.stream()
            .reduce (0, (a, b) -> a + b);
        System.out.println(suma);
    }
    }