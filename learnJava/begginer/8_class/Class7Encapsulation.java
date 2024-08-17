/* ENCAPSULATION , is used to make sure that "sensitive "data
is hidden from users .To use this : 
Declare class variables as private
get method : return the value 
set method : set the value 
*/
public class Class7Encapsulation{
  private String name ; //private = restricted
  public String getname(){
    return this.name ; 
  }
  public void setname(String name){
    this.name = name ; 
  }
  public static void main(String[] args){
    Class7Encapsulation obj = new Class7Encapsulation() ; 
    obj.setname("Aryan") ; 
    System.out.println(obj.getname());
  }
}