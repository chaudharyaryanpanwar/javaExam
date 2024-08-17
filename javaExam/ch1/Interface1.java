public class Interface1{

    /**
     * InnerInterface1
     */
    public interface Vehicle {
        void horn();
    }
    public static class Plane {
        void fly(){
            System.out.println("Plane is flying");
        }
    }
    public static class Car implements Vehicle {
        @Override
        public void horn() {
            System.out.println("Car horn");
        }
    }
    public static class Boeing extends Plane implements Vehicle {
        @Override
        public void horn() {
            System.out.println("Boeing horn");
        }
    }
    public static void main(String[] args) {
        Car c = new Car() ; 
        c.horn();
        Boeing b = new Boeing();
        b.horn();
        b.fly();
        
    }
}