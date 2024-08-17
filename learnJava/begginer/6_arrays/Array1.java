public class Array1{
  public static void main(String[] args){
    String[] cars = {"Volvo" , "BMW" , "Ford" , "Mazda"} ; 
    System.out.println(cars.length);
    for (String car : cars)System.out.println(car);
    int[] values= {1000 , 2000 , 3000} ; 
    for (int i  : values)System.out.println(i);
    values[0] = 10000 ; 
    for (int i : values)System.out.println(i);

    //multidimensional array
    int[][] numbers = {{1,2,3,4},{5,6,7}} ; 
    for (int i =0  ; i<numbers.length ; i++){
      for (int j = 0 ; j<numbers[i].length ; j++){
        System.out.println(numbers[i][j]);
      }
    }
  }
}