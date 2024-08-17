import java.util.Scanner ; 


public class Input1 {
    public static class Student {
        int rollNo ; 
        String name ; 
        int age ; 
        double marks ;
        String address ; 
    
        public Student(int rollNo , String name , int age , double marks , String address){
            this.rollNo = rollNo ; 
            this.name = name ; 
            this.age = age ; 
            this.marks = marks  ; 
            this.address = address ; 
        }
    }
    
    public static void add (int  a , int b ){
        System.out.println(a+b);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int a = sc.nextInt() ;
        int b = sc.nextInt() ; 
        add(a,b) ;
    }
}
