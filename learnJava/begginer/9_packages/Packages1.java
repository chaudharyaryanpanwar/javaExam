// imoprt package.name.Class ; //import a single class
// import package.name.* l //import the whole package
import java.util.Scanner;

class Packages1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}