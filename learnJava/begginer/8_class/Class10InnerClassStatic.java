class OuterClass{
  int x = 10 ; 

  static class InnerClass{
    int y = 5 ;
  }
}
// just like static attributes and methods, a static inner class does not have
//  access to members of the outer class.

public class Class10InnerClassStatic{
  public static void main(String[] args){
    OuterClass.InnerClass myInner = new OuterClass.InnerClass() ; 
    System.out.println(myInner.y) ; 
  }
}
