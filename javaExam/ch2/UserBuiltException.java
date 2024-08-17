package javaExam.ch2;

import java.util.Scanner ; 
public class UserBuiltException {
    public static  class InvalidAgeException extends Exception {
        public InvalidAgeException(String message){
            super(message) ;
        }
    }

    public static void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150){
            throw  new InvalidAgeException("Age must be between 0 and 150. ") ;
        } else {
            System.out.println("Age is valid") ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int age = sc.nextInt() ; 
        try {
            setAge(age) ;
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}