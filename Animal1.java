class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void printName() {
        // Accessing parent class variable using super
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.printName();
    }
}
