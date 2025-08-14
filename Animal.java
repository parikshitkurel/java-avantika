class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        // Parent class reference to parent object
        Animal a = new Animal();
        a.sound();

        // Parent class reference to child object (runtime polymorphism)
        Animal b = new Dog();
        b.sound();
    }
}
