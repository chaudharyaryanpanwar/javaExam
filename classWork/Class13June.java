package classWork ;
import java.util.ArrayList ; 
import java.util.Iterator ; 
class Class13June {
  public static void main(String [] args){
    ArrayList <String> list = new ArrayList<String>() ; 
    list.add("Aryan1");
    list.add("Aryan2");
    list.add("Aryan3");
    list.add("Aryan4");

    Iterator itr = list.iterator() ; 
    while(itr.hasNext()){
      System.out.println(itr.next()  ) ;
    }
  }
}
