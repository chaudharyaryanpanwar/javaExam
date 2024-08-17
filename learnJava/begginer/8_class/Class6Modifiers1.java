// FINAL and STATIC
public class Class6Modifiers1{
  // FINAL
  final int  x = 10 ; 
  final double PI = 3.14 ; 

  // STATIC
  static void myStaticMethod(){
    System.out.println("Static methods can be called without  creating an object of the class");
  }

  public static void main(String[] arsg){
    Class6Modifiers1 obj = new Class6Modifiers1() ; 
    // obj.x = 50 ; //error 
    // obj.PI = 25 ; //erroir
    System.out.println("Value of x : " +obj.x) ;
    myStaticMethod() ; 
  }
}
