package intermediate ; 

import java.io.* ; 

class Table {
    synchronized public void printTable(int n ){
        for (int i =1 ; i<=5 ; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Customer {
    int amount ; 

    synchronized public void withdraw(int amount){
        while (this.amount < amount){
            System.out.println("You want to withdraw" + amount + " but the available amount is "+ this.amount + "which is insufficient");
            try {
                wait();
            } catch (Exception e){
                e.printStackTrace();
            }
        } 
        this.amount -= amount;
        System.out.println(amount + " is withdrawn successfulyy , available balance is "+ this.amount);
    }

    synchronized public void deposit (int amount){
        this.amount += amount;
        System.out.println(amount + " is deposited successfully , available balance is "+ this.amount);
        notify(); 
    }
}
class MyThread1  extends Thread {
    Table t ; 
    public void run (){
        t.printTable(5);
    }
    public MyThread1(Table t){
        this.t = t ; 
    }
}
class MyRunnable2 implements Runnable {
    Table t ;
    public void run (){
        t.printTable(100);
    }
    public MyRunnable2(Table t){
        this.t = t ; 
    }
}
public class Thread1 {
    public static void main(String[] args) {
        Table t = new Table() ; 
        MyThread1 mt1 = new MyThread1(t);
        MyRunnable2 mr = new MyRunnable2(t);
        Thread mt2 = new Thread(mr);

        mt1.start() ;
        mt2.start() ; 

        FileWriter fw = null ; 
        try {
            fw = new FileWriter("Output.txt") ; 
            fw.write("Helllo world \n") ; 
            fw.write("This is me using FIlE Writer") ; 
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close() ; 
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        FileReader fr = null ;
        try {
            fr = new FileReader("Output.txt");
            int character ; 
            while ((character = fr.read()) != -1){
                System.out.print((char)character) ;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close() ;
                    } catch (IOException e){
                        e.printStackTrace();
                    }
            }        
        }


        BufferedWriter bw = null ; 
        try {
            bw =  new BufferedWriter( new FileWriter("Example.txt"));
            bw.write("Hello world \n") ;
            bw.write("This is me using BufferedWriter") ;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bw != null){
                try {
                    bw.close() ;
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        BufferedReader br = null ; 
        try {
            br = new BufferedReader(new FileReader("Exampele.txt")) ; 
            String line ; 
            while ((line = br.readLine() ) != null){
                System.out.println(line) ;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close() ;
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        FileOutputStream fos = null ; 
        try {
            fos = new FileOutputStream("Output.dat") ;
            byte [] data = { 65 , 66 , 67 , 68} ; 
            fos.write(data) ;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close() ;
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        FileInputStream fis = null ; 
        try {
            fis = new FileInputStream("Output.dat") ;
            int byteData ; 
            while ((byteData = fis.read()) != -1){
                System.out.println((char) byteData) ;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close() ;
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        BufferedOutputStream bos = null ; 
        try {
            bos = new BufferedOutputStream(new FileOutputStream("Example.dat")) ;
            byte [] data = {65  , 66 , 67 , 68} ;
            bos.write(data) ;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bos != null){
                try {
                    bos.close() ;
                } catch (IOException e){
                    e.printStackTrace();    
                }
            }
        }


         BufferedInputStream bis = null ; 
         try {
            bis = new BufferedInputStream(new FileInputStream("Example.dat")) ;
            byte [] data ; 
            while ((data = bis.readAllBytes()) != null){
                for (byte b : data){
                    System.out.println(b) ;
                }
            }
         } catch (IOException e){
            e.printStackTrace();
         } finally {
            if (bis != null){
                try {
                    bis.close() ;
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
         }
    }
}