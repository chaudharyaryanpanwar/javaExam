public class Whileloop{
  public static void main(String[] args){
    int i = 5 ;  
    while (i>0){
      System.out.println(i);
      i--;
    }
    i = 10 ; 
    do {
      System.out.println(i);
      i--;
    }
    while(i>5);
  }
}