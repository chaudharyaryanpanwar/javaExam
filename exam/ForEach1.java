package exam ;

import java.util.ArrayList; 
import java.util.List ; 

public class ForEach1 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("cricket");
        gamesList.add("football");
        gamesList.add("table tennis");
        gamesList.add("chess") ;
        gamesList.add("Hockey") ;
        System.out.println("Iterating using ForEach and lambda expression");
        gamesList.forEach( (games) -> System.out.println(games)) ;
        System.out.println("Iterating using ForEach and Method refrencing");
        gamesList.forEach(System.out :: println);
    }
}