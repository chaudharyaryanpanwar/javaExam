// Abstraction 
/*
Data abstraction is the process of hiding certain details
 and showing only essential information to the user.
Abstraction can be achieved with either abstract classes
 or interfaces
*/ 
abstract class Animal{
  public abstract void animalSound() ; 
  public void sleep(){
    System.out.println("Zzz") ; 
  }
}

// Animal myObj = new Animal() ;  
      // this will generate an error 

// to access the abstract class it must be inherited from anohter class.

// subclass (inherit from animal)
class Pig extends Animal{
  public void animalSound(){
    System.out.println("The pig says : wee wee") ; 
  }
}

class Class10Abstraction1{
  public static void main(String[] args){
    Pig myPig = new Pig() ;//create a pig object
    myPig.animalSound() ;
    myPig.sleep() ; 
  }
}