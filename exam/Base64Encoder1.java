package exam ; 

import java.util.* ; 

public class Base64Encoder1 {
    public static void main(String[] args) {
        String str = "Hello, World!" ;
        System.out.println("Sample String : "+ str);

        String BasicBase64format = Base64.getEncoder().encodeToString(str.getBytes()) ;
        System.out.println("Encoded String : " + BasicBase64format);

        byte [] actualByte = Base64.getDecoder().decode(BasicBase64format) ;

        String actualString = new String(actualByte) ;

        System.out.println("actual String : "+actualString);
    }
} 