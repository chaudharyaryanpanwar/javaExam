package javaExam.ch2;

import java.io.FileReader ; 
import java.io.IOException;
import java.io.BufferedReader ; 

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null ; 
        try {
            FileReader fileReader = new FileReader("example.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line ; 
            while ((line = bufferedReader.readLine()) != null){
                System.err.println(line);
            }
        } catch (IOException e){
         e.printStackTrace();
         } finally {
            if (bufferedReader != null){
                 try {
                    bufferedReader.close();
                  } catch (IOException e){
                    e.printStackTrace();
                }
           }    
         }
    }
}