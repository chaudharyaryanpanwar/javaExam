package javaExam.ch2  ;

import java.io.FileWriter; 
import java.io.IOException; 

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter = null ;
        try {
        fileWriter = new FileWriter("output.txt") ; 
        fileWriter.write("Hello, World!\n") ;
        fileWriter.write("This is a simple file writer program");
        // fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("File has been written successfully");
        }
    }
}