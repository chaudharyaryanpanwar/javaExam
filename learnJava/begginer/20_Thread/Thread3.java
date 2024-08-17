// using the thread class Thread(String Name)
public class Thread3 {
  public static void main(String[] args) {
    Thread t1 = new Thread("Thread 1");
    t1.start();
    String str = t1.getName() ;
    System.out.println(str);
  }
}
