/*
  Java Math class has many methods that allows you
  to perform mathematical operations
 */

/*Math.method(parameters)
methods = max , min , sqrt , abs , random 
*/

public class Math1{
  public static void main(String[] args){
    System.out.println(Math.max(5,10));
    System.out.println(Math.min(5,10));
    System.out.println(Math.sqrt(10));
    System.out.println(Math.abs(-4.7));
    System.out.println(Math.random()); 
    // generates a number between  0 and 1 

    int randomNum = (int)(Math.random()*101) ; 
    System.out.println(randomNum);
  }
}