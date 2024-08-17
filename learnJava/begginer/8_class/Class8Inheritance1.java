class Vehicle{
  protected String brand = "Ford" ; 
  public void honk(){
    System.out.println("Tuut , tuut !") ; 
  }
}

class Class8Inheritance1 extends Vehicle{
  private String modelName = "Endeavour" ; 
  public static void main(String[] args){
    
    Class8Inheritance1 myCar = new Class8Inheritance1() ; 
    myCar.honk() ; 

    System.out.println(myCar.brand + " "+ myCar.modelName) ; 
  }
}
