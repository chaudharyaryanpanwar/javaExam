
package javaExam.ch2 ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 

public class ByteStream1 {
    public static void main(String[] args) {
        // String inputFile = "input.dat" ; 
        String outputFile = "output.dat" ;
        FileOutputStream fos = null ; 
        FileInputStream fis = null ; 
        try {
            fos = new FileOutputStream(outputFile) ;
            byte [] data = {65 , 66 , 67 , 68} ; // example data {A , B , C , D} in ASCII
            fos.write(data) ; 
        } catch (IOException e ){
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        try {
            fis = new FileInputStream(outputFile) ;
            int byteData  ; 
            while ((byteData = fis.read()) != -1){
                System.out.print((char)byteData) ;
            }
        } catch (IOException e) {
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
    }
}
