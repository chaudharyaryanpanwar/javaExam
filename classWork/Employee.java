package classWork ;
import java.util.* ; 
public class Employee {
  public static class Emplyee {
    String name ; 
    int empid ; 
    int salary ;
    String place ; 

    public Emplyee(String name , int empid , int salary , String place){
      this.name = name  ;
      this.empid = empid ; 
      this.salary = salary ; 
      this.place = place ; 
    }
  }

  public static void main (String [] args){
    ArrayList<Emplyee> emplyees = new ArrayList<Emplyee>() ; 
    emplyees.add(new Emplyee("Rahul" , 1 , 1000 ,"Delhi") ) ; 
    emplyees.add(new Emplyee("Rahul" , 1 , 3900000 ,"Shamli") ) ;
    emplyees.add(new Emplyee("Rahul" , 1 , 4000000 ,"Baghpat") ) ;
    emplyees.add(new Emplyee("Rahul" , 1 , 5000 ,"Modinagar") ) ;
    emplyees.add(new Emplyee("Rahul" , 1 , 6000 ,"Delhi") ) ;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the place of the employee : ") ;
    String place = sc.nextLine() ;
    int salary = 0 ;
    for (int i = 0 ; i < emplyees.size() ; i++){
      if (emplyees.get(i).place.equals(place) ){
        if (salary < emplyess.get(i).salary){
          salary = emplyees.get(i).salary ;
        }
      }
    }
    System.out.println("The highest salary of the employee in " + place + " is " + salary);
  }

}