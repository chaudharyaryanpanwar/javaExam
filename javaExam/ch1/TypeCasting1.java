class TypeCasting1 {
    public static void main(String [] args){

        int myInt = 9 ; 
        double myDouble =  myInt ; //automatic casting 

        System.out.println(myDouble);


        int newInt = (int) myDouble ; 
        System.out.println(newInt);

        System.out.println("hello World");
    }
}