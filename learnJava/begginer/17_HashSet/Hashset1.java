// A HashSet is a collection of items where every item is unique, 
// and it is found in the java.util package:

import java.util.HashSet ; 
public class Hashset1{
  public static void main(String[] args){
    HashSet<String> cars = new HashSet<String>() ;
    cars.add("Volvo") ; 
    cars.add("Ford") ; 
    cars.add("BMW") ; 
    cars.add("Mazda") ; 
    System.out.println(cars) ; 

    //check if an item exists .contains(item)
    System.out.println(cars.contains("Volvo")) ; 

    //remove an item .remove(item)
    System.out.println("Before removing : \n" + cars ) ; 
    cars.remove("Volvo") ; 
    System.out.println("After removing : \n" + cars) ; 

    //remove all
    // cars.clear() ; 

    // size 
    System.out.println(cars.size()) ; 

    // loop through a hashset
    for (String i : cars){
      System.out.println(i) ; 
    }
  }
}