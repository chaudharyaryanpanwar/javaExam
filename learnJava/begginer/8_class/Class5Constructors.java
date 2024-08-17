/*
Constructors in java is a simple method which can be used to 
intitalize objects
*/ 
public class Class5Constructors{
  int x ; 
  /* Constructor name must match the class name , and it 
  cannot have return type . All classes have constructors by default .
  */ 
  public Class5Constructors(int value){
    x= value ; 
  }

  public static void main(String[] args){
    Class5Constructors obj = new Class5Constructors(100) ; 
    System.out.println("Value of x : " +obj.x) ;
  }
}