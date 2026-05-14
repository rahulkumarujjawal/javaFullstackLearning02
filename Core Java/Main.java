public class Main {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota Camry", "Blue");   // car1 is a reference
        Car car2 = new Car("Honda City", "Red");
        
        car1.accelerate();   // Calling method on object
        System.out.println(car1.model);  // Accessing field
    }
    }

