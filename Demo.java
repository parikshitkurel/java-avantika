class Demo {
    static int staticVar;
    int instanceVar;

    // Static initializer block
    static {
        staticVar = 10;
        System.out.println("Static block executed: staticVar = " + staticVar);
    }

    // Instance initializer block
    {
        instanceVar = 20;
        System.out.println("Instance initializer block executed: instanceVar = " + instanceVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Creating first object
        Demo obj1 = new Demo();

        // Creating second object
        Demo obj2 = new Demo();
    }
}
