package exam;

@FunctionalInterface
interface Sayable{
    void say() ;
    default void introduction(){
        System.out.println("Hello, I am a defaul method .");
    }
    static void speak(String msg){
        System.out.println(msg);
    }
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Sayable sayable = () -> System.out.println("Hello, I am a sayable object");
        sayable.say();
        sayable.introduction();
        Sayable.speak("Hello, I am a static method");
    }
}