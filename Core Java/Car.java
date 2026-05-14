public class Car {
    // Instance variables (state)
    String model;
    String color;
    int speed = 0;
    
    // Constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    
    // Method (behavior)
    public void accelerate() {
        speed += 10;
        System.out.println(model + " is accelerating!");
    }
}
