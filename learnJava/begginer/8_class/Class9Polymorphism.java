/*Polymorphism ,, 
Inheritance let us inherit attributes and methods from another class
POLYMORPHISM uses those methods to perform different tasks.
 This allows us to perform a single action in different ways .
*/ 

class Animal{
  public void animalSound(){
    System.out.println("The animal makes a sound") ; 
  }
}

class Pig extends Animal{
  public void animalSound(){
    System.out.println("The pigs says : wee wee") ; 
  }
}

class Dog extends Animal{
  public void animalSound(){
    System.out.println("The dog says : bow wow") ; 
  }
}

class Class9Polymorphism{
  public static void main(String[] args){
    Animal myAnimal = new Animal() ; 
    Animal myPig = new Pig() ; 
    Animal myDog= new Dog() ; 
    myAnimal.animalSound() ; 
    myPig.animalSound() ; 
    myDog.animalSound() ; 
  }
}