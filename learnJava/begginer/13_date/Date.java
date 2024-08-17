import java.time.LocalDate ; 
import java.time.LocalTime ;
import java.time.LocalDateTime ; 

public class Date{
  public static void main(String[] args){
    //display current date
    LocalDate myObj = LocalDate.now() ; 
    System.out.println(myObj) ; 

    //display current time
    LocalTime myObj1 = LocalTime.now() ; 
    System.out.println(myObj1);
    
    //display current date time 
    LocalDateTime myObj2 = LocalDateTime.now() ; 
    System.out.println(myObj2);
  }
}