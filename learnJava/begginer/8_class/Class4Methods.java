public class Class4Methods{
  /*      statics vs public
  static mehtods can be accessed without creating an object of the 
  class  , unlike public which can only be accessed by objects
  */
 static void myStaticMethod(){
  System.out.println("static method can be called witout creating the object");
 }

 public void myPublicMethod(){
  System.out.println("Public methods must be called by  creating objects") ; 
 }

 public static void main(String[] args){
  myStaticMethod() ; //calling the static method
  //myPublicMethod() ; this would be an error

  Class4Methods obj  = new Class4Methods() ; 
  obj.myPublicMethod() ;//creating an object and calling a public method
 }

}