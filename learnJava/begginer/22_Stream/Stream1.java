

import java.util.* ;
import java.util.stream.Collectors; 
public class Stream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Orange") ; 

        List <String> filteredList = list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList()) ;
        System.err.println(filteredList);
    }
}