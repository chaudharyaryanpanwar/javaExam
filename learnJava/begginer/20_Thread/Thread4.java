// Thread (Runnable r , String name)
public class Thread4 {
  public static class Multi3 implements Runnable {
    public void run() {
      System.out.println("Thread is running");
    }
  }

  public static void main(String[] args) {
    Runnable r1 = new Multi3() ; 

    Thread th1 = new Thread(r1 , "My new thread") ;
    th1.start() ; 
    String s1 = th1.getName() ; 
    System.out.println(s1) ;
  }
}
