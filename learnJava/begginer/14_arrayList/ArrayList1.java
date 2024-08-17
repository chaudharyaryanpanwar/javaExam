// The difference between a built-in array and an ArrayList in Java, 
// is that the size of an array cannot be modified (if you want to add or remove 
// elements to/from an array, you have to create a new one). While elements can be 
// added and removed from an ArrayList whenever you want. The syntax is also slightly different:

import java.util.ArrayList ; 
import java.util.Collections ; 

public class ArrayList1{
  public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>() ; 
    cars.add("Volvo") ; 
    cars.add("BMW") ; 
    cars.add("Ford") ; 
    cars.add("Mazda") ; 

    System.out.println(cars) ; 
    // add items
    cars.add("Jaguar") ; 

    //access an item 
    System.out.println(cars.get(0)) ;

    //set an item 
    cars.set(0 ,"Mahindra") ; 

    System.out.println(cars) ; 

    //remove an item 
    cars.remove(0) ; 

    // to remove all the elements 
    // cars.clear() ; 
    
    // ArrayList Size  
    System.out.println(cars) ; 
    System.out.println(cars.size()) ; 

    // looping through arrayList
    for (String s : cars) {
      System.out.println(s);
    }

    for (int i = 0 ; i<cars.size() ; i++){
      System.out.println(cars.get(i));
    }

    // sorting array lists 
    Collections.sort(cars); //collections need to be imported

    System.out.println("After sorting : ") ; 
    for (String s : cars){
      System.out.println(s) ; 
    }
  }
}
