package javaExam.ch2 ; 

class Table {
    void printTable(int n){ //method not synchronized
        for (int i =1 ; i <=5 ; i++){
            System.out.println(i*n);
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.err.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t ; 
    public MyThread1 (Table t){
        this.t  = t ; 
    }
    public void run (){
        t.printTable(5);
    }
}

class MyThread2 implements Runnable {
    Table t ; 
    public MyThread2 (Table t){
        this.t = t ; 
    }
    public void run (){
        t.printTable(100);
    }
}

public class UnSynchronized1 {
    public static void main(String[] args) {
        Table t = new Table(); //only one object
        MyThread1 t1 = new MyThread1(t) ; 
        Thread t2 = new Thread(new MyThread2(t)) ;
        t1.start();
        t2.start();
    }
}