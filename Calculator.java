class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using int version
        int sumInt = calc.add(5, 10);

        // Using double version
        double sumDouble = calc.add(5.5, 10.2);

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}
