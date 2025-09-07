class Vehicle {
    void wheels() {
        System.out.println("All vehicles have wheels");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car runs on petrol or diesel");
    }
}

class Bike extends Vehicle {
    void fuelType() {
        System.out.println("Bike runs on petrol");
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.wheels();
        c.fuelType();

        b.wheels();
        b.fuelType();
    }
}
