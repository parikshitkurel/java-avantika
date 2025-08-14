class Test {
    @Override
    public String toString() {
        return "Test Object";
    }

    public static void main(String[] args) {
        Test obj = new Test();

        // Calls overridden toString() method
        System.out.println(obj.toString());

        // Even if we pass the object directly to println, toString() is called implicitly
        System.out.println(obj);
    }
}
