public class Exceptions1{
  public static void main(String[] args){
    try {
      int[] numbers = {1  , 2, 3, 4, 5}; 
      System.out.println(numbers[10]) ; 
    } catch (Exception e){
      System.out.println("something went wrong") ; 
    } 
    finally{ //finally lets execute code after try catch 
    // regardless of the result
      System.out.println("The 'try-catch' is finished") ; 
    }



  }
}