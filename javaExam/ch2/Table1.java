// package javaExam.ch2 ; 

// public class Synchronized1 {
//     public static void main(String[] args) {
//         Table1 t = new Table1() ; //single object
//         MyThread11 t1 = new MyThread11(t);
//         Thread t2 = new Thread(new MyThread21(t));
//         t1.start() ;
//         t2.start() ; 
//     }
// }

// class Table1 {
//     synchronized void printTable(int n){
//         for (int i =1 ; i<= 5; i++){
//             System.out.println(n*i);
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e ){
//                 System.err.println(e);
//             }
//         }
//     }
// }

// public class MyThread11 extends Thread {
//     Table1 t ; 
//     public MyThread11(Table1 t){
//         this.t = t; 
//     }
//     public void run(){
//         t.printTable(5);
//     }
// }

// public class MyThread21 implements Runnable {
//     Table1 t ; 
//     public MyThread21(Table1 t){
//         this.t = t ; 
//     }
//     public void run(){
//         t.printTable(100);
//     }
// }

