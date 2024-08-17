// An Iterator is an object that can be used to loop through 
// collections, like ArrayList and HashSet.

import java.util.ArrayList ; 
import java.util.Iterator ; 

public class Iterator1{
  public static void main(String[] args){

    //make a collection
    ArrayList<String> cars = new ArrayList<String>() ; 
    cars.add("Volvo")  ; 
    cars.add("BMW") ; 
    cars.add("Ford") ; 
    cars.add("Mazda") ; 

    System.out.println("Cars : "+ cars);

    // get the iterator 
    Iterator <String> it = cars.iterator() ;

    // operation using iterator 

    while (it.hasNext()){
      if (it.next() == "Volvo")it.remove() ; 
      System.out.println(it.next()) ; 
    }

  System.out.println("After operations : " +cars) ; 
  }
}