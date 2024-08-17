// Wrapper classes provide a way to use primitive data types 
// (int, boolean, etc..) as objects

// working with objects allow us to  use certain methods 
// following methods are used to get the value associated with 
// the corresponding wrapper object: intValue(), byteValue(), 
// shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().


  // creating wrapper objects : to creata a wrapper objects , use the wrapper class instead of the primitive type . 

public class Class11WrapperClasses {
  public static void main(String[] args) {
      // Creating wrapper objects
      Integer myInt = 101 ; 
      Double myDouble = 5.99;
      Character myChar = 'A';

      // Printing wrapper objects
      System.out.println(myInt);
      System.out.println(myDouble);
      System.out.println(myChar);

      // Converting wrapper object to string and printinglength
      String myString = myInt.toString();
      System.out.println(myString.length());
  }
}

