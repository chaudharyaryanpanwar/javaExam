public class Abstraction1 {

    static abstract class Animal{
        public abstract void animalSound() ; 
        public void sleep(){
            System.out.println("Sleeping");
        }    
    }

    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: Oink");
        }
    }
    public static void main(String[] args) {
        // Create an instance of the abstract class
        Animal myAnimal = new Pig();
        myAnimal.sleep();
        myAnimal.animalSound();
        

    }
}