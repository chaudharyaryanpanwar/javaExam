/*
Attributes in the class are the variables inside the class
Another name for attributes is class fields .
*/ 
public class Class3{
  final int x = 5 ; // if attributes are constants
  int y = 3 ; 
  public static void main(String[] args){
    Class1OOP obj = new Class1OOP() ; 
    System.out.println(obj.x) ; //accessing the attributes
    obj.x = 100 ; 
    System.out.println(obj.x);
  }
}