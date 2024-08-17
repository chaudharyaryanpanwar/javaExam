// ENUMS
/*ENUMS is a special "class" that represents a group of
cosntants . 
*/ 
public class enum1{
  enum Level{
    LOW ,
    MEDIUM ,
    HIGH
  }

  public static void main(String[] args){
    Level myVar = Level.MEDIUM ; 
    System.out.println(myVar) ; 
  }
}