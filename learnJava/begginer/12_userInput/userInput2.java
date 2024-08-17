import java.util.Scanner ; 
public class userInput2{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in) ; 
    System.out.println("Enter roll no , name , class , section , percentage : ");
    int roll_no = cin.nextInt() ;

    // ------------------------------------
    cin.nextLine() ; //consume the newline character input after the integer input
    // ------------------------------------
    
    String name = cin.nextLine() ; 
    String className = cin.nextLine() ; 

    // ------------------------------------
    char section = cin.next().charAt(0) ;
    //-------------------------------------


    double percentage = cin.nextDouble() ;

    System.out.println("Your data : ") ; 
    System.out.println(roll_no) ; 
    System.out.println(name) ; 
    System.out.println(className) ; 
    System.out.println(section) ; 
    System.out.println(percentage) ; 

    cin.close() ;//close the scanner object to prevent
    // resource leak

  }
}