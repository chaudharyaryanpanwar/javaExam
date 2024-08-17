// ABSTRACT
abstract class Class6Modifiers2{
  public String fname = "Aryan" ;
  public int age = 20 ; 
  public abstract void study() ; //abstract method
}
// Subclass (inherit from parent)
class Student extends  Class6Modifiers2{
  public int graduationYear = 2026 ; 
  public void study(){
    // the body of the abstract method is provided here
    System.out.println("Studying all day long") ; 
  }
}
// End code from filename : Class6Modifiers2.java
// move to  next file: Class6Modifiers3.java