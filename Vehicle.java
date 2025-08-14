class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

class Test {
    public static void main(String[] args) {
        // Base class reference holding derived class object
        Vehicle v = new Car();
        v.move(); // Calls overridden method in Car
    }
}
