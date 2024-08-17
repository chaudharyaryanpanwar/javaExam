import java.util.* ; 
/*Write a progam that reads a list of String from the user and
 throws a exception if the String is less than 5 characters*/ 

//  NAME : ARYAN PANWAR
// CLASS : 4A
// ROLL NO. : 54
public class Ques2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of strings");
    int n = sc.nextInt();
    String [] arr = new String[n];
    try {
    for(int i = 0 ; i < n ; i++){
      System.out.println("Enter the string");
      arr[i] = sc.next();
      if(arr[i].length() < 5){
        throw new Exception("String is less than 5 characters");
      }
    }
    } catch(Exception e){
      System.out.println(e);
    }
    System.out.println("All the strings should be greater than 5 characters");
  }
}