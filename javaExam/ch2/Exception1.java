package javaExam.ch2 ;

import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        try {
            int [] myNumbers = {1 , 2, 3} ;
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            e.printStackTrace() ; 
        }
    }
}