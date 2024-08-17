package javaExam.ch2 ; 

import java.util.Scanner;

public class Exception2 {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied - You must be atleast 18 years old") ;
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt() ;
    //     checkAge(age);

    //     System.out.println("program completed.");
    // }

    public static void main(String[] args) {
        int  age  = 3 ;
         try {
            checkAge(age);
         } catch (Exception e){
            e.printStackTrace();
         }

         System.out.println("program completed.");
    }
}