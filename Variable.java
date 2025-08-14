class Variable {
    int x = 5; // Object variable

    void show() {
        int x = 10; // Local variable
        System.out.println("Local x: " + x);
        System.out.println("Object x: " + this.x);
    }

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.show();
    }
}
