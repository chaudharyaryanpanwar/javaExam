public class SubClass2 {

    static class Car  {
        String name ;
        int price ; 
        int passengerCapacity ;

        public Car(String name , int price , int passengerCapacity){
            this.name = name ; 
            this.price = price ; 
            this.passengerCapacity = passengerCapacity ; 
        }

        void horn(){
            System.out.println("Horn of Car");
        }
    }
    static class Porsche extends Car {
        int model ; 
        public Porsche(String name , int price , int passengerCapacity , int model){
            super(name, price, passengerCapacity);
            this.model = model ;
        }

        void horn(){
            super.horn();
            System.out.println("Horn of Porsche");
        }
    }

    static class Toyota extends Car {

        public Toyota(){
            super("Toyota", 10000, 5);
        } 

    }
    public static void main(String[] args) {
        System.out.println();
        Car c = new Car("Toyotoa", 4500000, 4);
        c.horn();
        Porsche p = new Porsche("Porsche", 5000000, 4, 2024);
        p.horn();
        // Porsche p1 = new Porsche() ;   ERROR
        // p1.horn();
        Toyota t = new Toyota() ;
        t.horn();
        System.out.println(t.name);
    }
}