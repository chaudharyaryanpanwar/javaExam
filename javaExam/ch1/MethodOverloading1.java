public class MethodOverloading1{

    static int myMethod(int x){
        return x + 10 ; 
    }

    static float myMethod(float x){
        return x + 20 ; 
    }
    public static void main(String[] args) {
        int myInt = 1 ; 
        float myFloat = 5 ; 
        

        System.out.println(myMethod(myInt));
        System.out.println(myMethod(myFloat));
    }
}