class Promotion {
    void show(int a) {
        System.out.println("int method called with value: " + a);
    }

    void show(double a) {
        System.out.println("double method called with value: " + a);
    }

    public static void main(String[] args) {
        Promotion obj = new Promotion();

        // Exact match with int parameter
        obj.show(10);

        // Exact match with double parameter
        obj.show(10.5);

        // Automatic type promotion: int literal promoted to double
        obj.show(10L); // long -> promoted to double
    }
}
