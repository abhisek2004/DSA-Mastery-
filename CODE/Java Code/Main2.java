// create a class and create two objects in java class vechile and next vechile car and another object new vechile bus =new vechile  vechiloe 

class Vehicle {
    String type;
    int wheels;

    public Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    public void displayInfo() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Number of Wheels: " + wheels);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", 4);
        Vehicle bus = new Vehicle("Bus", 6);

        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("\nBus Details:");
        bus.displayInfo();
    }
}
