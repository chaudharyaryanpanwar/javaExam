public class Strings1{
  public static void main(String[] args){
    String greeting = "Hello" ; 
    // string length 
    System.out.println("The length of the text String is : " + greeting.length());
    //Strings methods
    System.out.println(greeting.toUpperCase());
    System.out.println(greeting.toLowerCase());

    // finding a character in string
    System.out.println(greeting.indexOf("ello"));
    System.out.println(greeting.indexOf("o"));

    // string concatenation 
    String firstName = "Aryan" ; 
    String lastName = "Panwar" ; 
    System.out.println(firstName + " " + lastName);
    int x =10 ; 
    System.out.println(firstName + x);
  }
}