package javaExam.ch2 ; 

import java.io.IOException; 
import java.io.FileWriter ; 
import java.io.BufferedWriter; 

public class BufferedWriterExample {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null ; 
        try {
            // Create a new file
            FileWriter fileWriter = new FileWriter("example.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello world using buffered") ; 
            bufferedWriter.newLine() ;
            bufferedWriter.write("This is a new line") ;
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           if (bufferedWriter != null){
            try {
                bufferedWriter.close();
            } catch (IOException e){
                e.printStackTrace();
            }
           }

        }
    }
}