// A HashMap however, store items in "key/value" pairs, and you 
// can access them by an index of another type (e.g. a String).

// One object is used as a key (index) to another object (value). 
// It can store different types: String keys and Integer values, or the same type,
//  like: String keys and String values:
import java.util.HashMap;

public class Hashmap1{
  public static void main(String[] args){
    HashMap<String , String> capitalCities = new HashMap<String , String>() ;
    capitalCities.put("England" , "London") ;
    capitalCities.put("Germany" , "Berlin") ; 
    capitalCities.put("Norway" ,"Oslo") ; 
    capitalCities.put("USA" ,"Washington DC") ; 
    System.out.println(capitalCities);

    //access an item  .get(key)
    System.out.println(capitalCities.get("England"));

    //remove an item 
    System.out.println(capitalCities);
    capitalCities.remove("England") ; 
    System.out.println("After removal : " + capitalCities);


    //to remove all the items 
    // capitalCities.clear()

    //number of items : .size() 
    System.out.println(capitalCities.size());

    //loop through a hashmap
    for (String i : capitalCities.keySet()){
       //for keys
      System.out.println(i);
    }

    for (String i : capitalCities.values()){ 
      //for values
      System.out.println(i) ; 
    }
    System.out.println(capitalCities);


    // for keys and values both
    for (String i : capitalCities.keySet()){
      System.out.println("key : "+i+" , value : "+ capitalCities.get(i));
    }
  }
}

