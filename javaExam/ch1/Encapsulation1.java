public class Encapsulation1 {
    public static class Car {
        private String brand;
        private String model;
        private int year;
        private String color ; 

        public Car(String brand , String model , int year , String color){
            this.brand = brand;
            this.model = model ; 
            this.year = year ; 
            this.color = color ; 
        }

        void getBrand(){
            System.out.println(brand);
        }
        void getModel(){
            System.out.println(model);
        }
        void getYear(){
            System.out.println(year);
        }
        void getColor(){
            System.out.println(color);
        }

        void setBrand(String brand){
            this.brand = brand;
        }
        void setModel(String model){
            this.model = model ; 
        }
        void setYear(int year ){
            this.year = year ; 
        }
        void setColor(String color){
            this.color = color ;
        }
    }
    public static void main(String[] args) {
        
    }
}