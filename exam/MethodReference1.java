package exam ;

import java.lang.reflect.Method;

@FunctionalInterface
interface Sayable {
    public void say() ;
}

public class MethodReference1 {
    public static void saySomething(){
        System.out.println("I am saying something . Am I ?");
    }
    public static void main(String[] args) {
        Sayable sayable = MethodReference1 :: saySomething ;
        sayable.say();
    }
}