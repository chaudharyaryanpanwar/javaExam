// To access the inner class, create an object of the outer class, 
// and then create an object of the inner class
class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }

  public void displayInnerY(){
    InnerClass myInner = new InnerClass() ; 
    System.out.println(myInner.y) ; 
  }
}
//error occurs
public class Class10InnerClassPrivate{
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();// error line
    System.out.println(myInner.y + myOuter.x); //error line
    // myOuter.displayInnerY() ; //corrrect line
  }
}

