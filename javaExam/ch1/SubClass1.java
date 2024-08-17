public class SubClass1 {

    public static class Animal {
        void makeSound(){
            System.out.println("Animal makes sound");
        }
    }
    // method overriding
    public static class Dog extends Animal {
        @Override
        void makeSound(){
            System.out.println("Dog makes sound");
        }
    }

    // use of super keyword
    public static class Cat extends Animal{
        void makeSound() {
            super.makeSound();
            System.out.println("Meow Meow");
        }
    }
    public static void main(String[] args) {
        Animal a = new Animal(); 
        a.makeSound();
        System.out.println();
        Dog d = new Dog();
        d.makeSound();
        System.out.println();
        Cat c = new Cat();
        c.makeSound();
        
    }
}