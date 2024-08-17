package javaExam.ch2 ; 

import java.io.FileReader ; 
import java.io.IOException; 

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null ; 
        try {
            fileReader = new FileReader("output.txt") ;
            int character ; 
            while ((character = fileReader.read())!= -1 ){
                System.out.print((char)character) ;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}