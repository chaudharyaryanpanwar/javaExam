// Method overloading  is a feature in Java that allows you to have multiple methods with the same name but different parameters.
//  This means we can use one method name for similar operations performed on different data types or under different conditions
public class Method3{
  static int sum(int x ,  int y ){
    return x+y  ; 
  }
  
  static float sum(float x , float y){
    return x+y ; 
  }

  static double sum(double x , double y){
    return x+y ; 
  }

  static String sum(String x , String y){
    return x+y ;
  }

  public static void main(String[] args){
    int myNum1 = sum(8 , 5)  ;
    double myNum2 = sum(4.3 , 6.26) ; 
    String myNum3 = sum("Aryan " , "Panwar"); 
    System.out.println(myNum1);
    System.out.println(myNum2);
    System.out.println(myNum3);
  }
}