import java.util.LinkedList ; 
// The LinkedList class has all of the same methods as the ArrayList class 
// because they both implement the List interface.
//  This means that you can add items, change items,
//  remove items and clear the list in the same way.


public class Linkedlist1{
  public static void main(String[] args){
    LinkedList<String> cars = new LinkedList<String>() ; 
    cars.add("Volvo") ; 
    cars.add("Ford") ; 
    cars.add("BMW") ; 
    cars.add("Mazda") ; 
    System.out.println(cars);
  }
} 