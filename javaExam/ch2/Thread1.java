package javaExam.ch2 ; 


// thread states: 
// 1.New 2.Active(Runnable , Running) 3.Blocked/Waiting 4.Timed Waiting 5.Terminated

public class Thread1{
    public static class ThreadExample1 extends Thread {
        public void run(){
            int a = 10 ; 
            int b = 12 ; 
            int result = a + b ; 
            System.out.println("Thread is starting");
            System.out.println("Sum of two numbers is : " + result);
        }
    }

    public static class NewThread implements Runnable {
        String name ; 
        Thread thread ; 
        public NewThread(String name){
            this.name = name ; 
            thread = new Thread(this , name) ; 
            System.out.println("A new thread  : " + thread  + "is created \n");
            // thread.start() ; 
        }
        public void run(){
            System.out.println("this thread is : "+ name);
        }
    }

    public static class NewThread2 implements Runnable {
        String name ; 
        public void run(){
            System.out.println("This is Type -2 Thread running : "+ name);
        }
        public NewThread2 (String name){
            this.name = name ; 
        }
    }

    public static void main(String[] args) {
        ThreadExample1 thread1 = new ThreadExample1() ; 
        thread1.start() ; 
        NewThread thread2 = new NewThread("Thread-2") ;
        NewThread thread3 = new NewThread("Thread-3") ;
        thread2.thread.start();
        thread3.thread.start();
        NewThread2 thread4 = new NewThread2("Thread - 4 ") ;
        Thread t4 = new Thread(thread4) ; 
        t4.start();
    }

}
