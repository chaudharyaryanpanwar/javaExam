public class Forloop{
  public static void main(String[] args){
    int n = 10 ; 
    for(int i =0 ; i < n ; i++){
      System.out.println(i);
    }
    //for each looop  in java is used to iterate over an array or a collection of objects. 
    String[] cars = {"Volvo" , "BMW" , "Ford" ,"Mazda"};
    for (String i : cars){
      System.out.println(i);
    }
    int[] array = {100 , 200 , 300 , 400} ; 
    for (int i : array){
      System.out.println(i);
    } 
  }
}