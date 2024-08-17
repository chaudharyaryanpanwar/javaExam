public class Exceptions2{
  static void checkAge(int age) throws Exception {
    if (age < 18 ){
      throw new ArithmeticException("Access denied - you must be atlead 18 years old") ; 
    } else{
      System.out.println("Access granted") ; 
    }
  }

  public static void main(String[] args){
    try  {
    checkAge(20) ; 
    } catch (Exception e){
      e.printStackTrace();
    }
    // checkAge(16);
  }
}