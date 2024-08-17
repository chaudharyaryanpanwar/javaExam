import java.util.Scanner  ;
public class userInput1{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in) ; //create a scanner object
    System.out.println("Enter username") ; 

    String username = obj.nextLine() ;//read user input
    System.out.println("Username is : "+username) ; 
  }
}

// to take input of different types of datatypes : we use
/*
nextLine : string 
nextBoolean : boolean 
nextByte : byte
nextDouble : double
nextFloat  : float
nextInt : integer 
nextLong : long
nextShort : short
*/ 