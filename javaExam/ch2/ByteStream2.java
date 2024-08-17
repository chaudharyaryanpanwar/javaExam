package javaExam.ch2 ; 

import java.io.FileInputStream;
import java.io.FileOutputStream; 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream ; 
import java.io.IOException;


public class ByteStream2 {
    public static void main(String[] args) {
        String fileName = "example.dat" ; 

        BufferedInputStream bis = null ; 
        BufferedOutputStream bos = null ;

        try {
            bos = new BufferedOutputStream( new FileOutputStream(fileName)) ;
            byte [] data = {  65 , 66 , 67 , 68 } ; 
            bos.write(data) ;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


        try {
            bis = new BufferedInputStream( new FileInputStream(fileName));
            int byteData  ; 
            while ((byteData = bis.read()) != -1){
                System.out.print((char) byteData + " ") ;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bis != null){
                try {
                    bis.close() ; 
                } catch (IOException e ){
                    e.printStackTrace();
                }
            }
        }
    }
}