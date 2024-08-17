// INTERFACES
// An interface is a completely "abstract class" that is
//  used to group related methods with empty bodies

interface Animal{
  public void animalSound() ; 
  public void run() ; 
}

// to access the interface methods "implements " is used
// instead of extends
class Pig implements Animal{
  public void animalSound(){
    System.out.println("The pig says : wee wee") ; 
  }
  // error as Pig does not override the run method
  public void run(){
    System.out.println("Print pig is runnning") ; //error if we do not override the run method
  }
  public void sleep(){
    System.out.println("Zzz") ;
  }
}

class interfaces1{
  public static void main(String[] args){
    Pig myPig = new Pig() ;
    myPig.animalSound() ; 
    myPig.sleep() ; 
    
  }
}