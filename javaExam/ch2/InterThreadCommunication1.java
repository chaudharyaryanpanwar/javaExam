package javaExam.ch2;

class Customer {
    int amount = 10000; 

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw ....");

        while (this.amount < amount){
            System.out.println("insufficient balance , waiting for deposit");
            try {
                wait(); 
            } catch (Exception e){
                System.err.println(e);    
            }
        }

        this.amount -= amount ; 
        System.out.println("Withdraw completed");
    }


    synchronized void deposit(int amount){
        System.out.println("going to deposit ....");
        this.amount += amount ; 
        System.out.println("deposit completed");
        notify(); // notify the waiting thread
    }

}
class MyThread1 extends Thread {
    Customer c;
    public MyThread1(Customer c){
        this.c = c ; 
    }
    public void run(){
        c.withdraw(15000);
    }
}

class MyhThread2 extends Thread {
    Customer c;
    public MyhThread2(Customer c){
        this.c = c ;
    }
    public void run(){
        c.deposit(20000);
    }
}
public class InterThreadCommunication1 {
    public static void main(String[] args) {
        Customer c = new Customer();
        MyThread1 t1 = new MyThread1(c);
        MyhThread2 t2 = new MyhThread2(c);
        t1.start();
        t2.start();

    }
}