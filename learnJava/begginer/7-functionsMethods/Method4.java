// Recursion
public class Method4{
  static int factorial(int x){
    if (x<1)return -1 ; 
    if (x == 1)return 1 ; 
    else return factorial(x-1 ,x ) ; 
  }

  static int factorial (int x , int fact){
    if (x==1)return fact ;//halting condition
    return factorial(x-1 , fact*x);
  }

  public static void main(String[] args){
    System.out.println("Factorial of 5 is " + factorial(5));  
  }
}